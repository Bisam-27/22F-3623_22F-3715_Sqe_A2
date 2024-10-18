package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.LoginPage;
import pageobjects.SearchPage;

public class LoginSteps {

    WebDriver driver;
    LoginPage loginPage;
    SearchPage searchPage;

    @Given("The user is on the Instagram login page")
    public void theUserIsOnTheInstagramLoginPage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
        loginPage.goToLoginPage();
    }

    @When("The user enters username {string} and password {string}")
    public void theUserEntersValidCredentials(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @And("The user clicks the login button")
    public void theUserClicksTheLoginButton() {
        loginPage.clickLogin();
    }

    @Then("The user should be logged in successfully")
    public void theUserShouldBeLoggedInSuccessfully() {
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
    }
}
