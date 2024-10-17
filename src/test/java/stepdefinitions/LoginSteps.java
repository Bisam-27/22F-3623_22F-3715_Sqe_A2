package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.LoginPage;

public class LoginSteps {

    WebDriver driver;
    LoginPage loginPage;
    
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
        loginPage.goToLoginPage();
    }

    @When("The user enters username {string} and password {string}")
    public void theUserEntersValidCredentials(String username, String password) {
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
        // You can add verification logic here, such as checking the URL or checking the presence of user-specific elements on the homepage

        // Close the browser after the test
        //driver.quit();
    }
}
