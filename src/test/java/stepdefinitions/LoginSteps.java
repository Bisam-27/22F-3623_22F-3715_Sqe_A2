package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.LoginPage;
<<<<<<< HEAD
=======
import pageobjects.SearchPage;
>>>>>>> bisam

public class LoginSteps {

    WebDriver driver;
    LoginPage loginPage;
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


    @Given("The user is on the Instagram login page")
    public void theUserIsOnTheInstagramLoginPage() {
        // Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Initialize ChromeDriver
        driver = new ChromeDriver();

        // Maximize the window
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
    }

    @When("The user enters username {string} and password {string}")
    public void theUserEntersValidCredentials(String username, String password) {
<<<<<<< HEAD
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
        // You can add verification logic here, such as checking the URL or checking the presence of user-specific elements on the homepage

        // Close the browser after the test
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
