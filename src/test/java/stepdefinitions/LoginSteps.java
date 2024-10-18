package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.LoginPage;
import java.time.Duration;

public class LoginSteps {

    WebDriver driver;
    LoginPage loginPage;
    WebDriverWait wait;

    @Given("The user is on the Instagram login page")
    public void theUserIsOnTheInstagramLoginPage() {
        // Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        // Initialize LoginPage object
        loginPage = new LoginPage(driver);
        
        // Go to Instagram login page
        loginPage.goToLoginPage();
        
        // Setup explicit wait
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @When("The user enters username {string} and password {string}")
    public void theUserEntersCredentials(String username, String password) {
        // Enter the username and password
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @And("The user clicks the login button")
    public void theUserClicksTheLoginButton() {
        // Click the login button
        loginPage.clickLogin();
    }

    @Then("The user should be logged in successfully")
    public void theUserShouldBeLoggedInSuccessfully() {
        // Check if the user is redirected to the Instagram home page (or an element that appears only when logged in)
        wait.until(ExpectedConditions.urlContains("https://www.instagram.com/"));
        String currentUrl = driver.getCurrentUrl();
        if (!currentUrl.contains("instagram.com")) {
            throw new AssertionError("User is not logged in successfully.");
        }
        //driver.quit();
    }

    @Then("The user should see an error message for invalid credentials")
    public void theUserShouldSeeAnErrorMessageForInvalidCredentials() {
        // Wait for the error message to appear and verify it
        By errorMsgLocator = By.xpath("//p[@id='slfErrorAlert']"); // Locator for Instagram's error message
        wait.until(ExpectedConditions.visibilityOfElementLocated(errorMsgLocator));
        String errorMsg = driver.findElement(errorMsgLocator).getText();
        if (!errorMsg.contains("Sorry, your password was incorrect")) {
            throw new AssertionError("Expected invalid credentials error message not found.");
        }
        //driver.quit();
    }

    @Then("The user should see a message for empty credentials")
    public void theUserShouldSeeAMessageForEmptyCredentials() {
        // Verify that the empty fields prevent login (by checking if the login button remains inactive or some error is shown)
        By loginButton = By.xpath("//button[@type='submit']");
        boolean isButtonEnabled = driver.findElement(loginButton).isEnabled();
        if (isButtonEnabled) {
            throw new AssertionError("Login button should be disabled when credentials are empty.");
        }
        //driver.quit();
    }
}
