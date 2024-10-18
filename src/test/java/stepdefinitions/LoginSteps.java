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
<<<<<<< HEAD
<<<<<<< HEAD
=======
import pageobjects.SearchPage;
>>>>>>> bisam
=======
import java.time.Duration;
>>>>>>> d3f2f2e9c30d5009955b34d8566a3ba8ae2ff16d

public class LoginSteps {

    WebDriver driver;
    LoginPage loginPage;
<<<<<<< HEAD
<<<<<<< HEAD
    
   // @Before
    //public void setUp() {
        // Set the path of the ChromeDriver executable
      //  System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");

        // Initialize the WebDriver (Chrome)
        //driver = new ChromeDriver();

        // Optionally maximize the window
        //driver.manage().window().maximize();
    //}

=======
    WebDriverWait wait;
>>>>>>> d3f2f2e9c30d5009955b34d8566a3ba8ae2ff16d

    @Given("The user is on the Instagram login page")
    public void theUserIsOnTheInstagramLoginPage() {
        // Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        // Initialize LoginPage object
        loginPage = new LoginPage(driver);
        
        // Go to Instagram login page
=======
    SearchPage searchPage;

    @Given("The user is on the Instagram login page")
    public void theUserIsOnTheInstagramLoginPage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
>>>>>>> bisam
        loginPage.goToLoginPage();
        
        // Setup explicit wait
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @When("The user enters username {string} and password {string}")
<<<<<<< HEAD
    public void theUserEntersValidCredentials(String username, String password) {
<<<<<<< HEAD
=======
    public void theUserEntersCredentials(String username, String password) {
>>>>>>> d3f2f2e9c30d5009955b34d8566a3ba8ae2ff16d
        // Enter the username and password
=======
>>>>>>> bisam
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @And("The user clicks the login button")
    public void theUserClicksTheLoginButton() {
<<<<<<< HEAD
        // Click the login button
=======
>>>>>>> bisam
        loginPage.clickLogin();
    }

    @Then("The user should be logged in successfully")
    public void theUserShouldBeLoggedInSuccessfully() {
<<<<<<< HEAD
<<<<<<< HEAD
        // You can add verification logic here, such as checking the URL or checking the presence of user-specific elements on the homepage
=======
        // Check if the user is redirected to the Instagram home page (or an element that appears only when logged in)
        wait.until(ExpectedConditions.urlContains("https://www.instagram.com/"));
        String currentUrl = driver.getCurrentUrl();
        if (!currentUrl.contains("instagram.com")) {
            throw new AssertionError("User is not logged in successfully.");
        }
        //driver.quit();
    }
>>>>>>> d3f2f2e9c30d5009955b34d8566a3ba8ae2ff16d

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
=======
        // Validation for successful login
    }

    @When("The user clicks the search button")
    public void theUserClicksTheSearchButton() {
        // Initialize SearchPage object after login
        searchPage = new SearchPage(driver);
        // Click search button
        searchPage.clickSearchButton();
    }

    @And("The user searches for {string}")
    public void theUserSearchesFor(String query) {
        // Enter the search query
        searchPage.enterSearchQuery(query);
    }

    @Then("The search results should be displayed")
    public void theSearchResultsShouldBeDisplayed() {
        boolean resultDisplayed = searchPage.isSearchResultDisplayed();
        if (resultDisplayed) {
            System.out.println("Search results are displayed.");
        } else {
            System.out.println("Search results are not displayed.");
        }
        // Close the browser after the test
        driver.quit();
>>>>>>> bisam
    }
}
