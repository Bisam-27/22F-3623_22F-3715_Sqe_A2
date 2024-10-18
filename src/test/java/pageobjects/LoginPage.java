package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> d3f2f2e9c30d5009955b34d8566a3ba8ae2ff16d
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
<<<<<<< HEAD
>>>>>>> bisam
=======
>>>>>>> d3f2f2e9c30d5009955b34d8566a3ba8ae2ff16d

public class LoginPage {

    WebDriver driver;
<<<<<<< HEAD
<<<<<<< HEAD

    // Locators for Instagram login elements
    By usernameField = By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input"); // Instagram username input field
    By passwordField = By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input"); // Instagram password input field
    By loginButton = By.xpath("//*[@id=\"loginForm\"]/div/div[3]"); // Instagram login button
=======
    WebDriverWait wait;

=======
    WebDriverWait wait;

>>>>>>> d3f2f2e9c30d5009955b34d8566a3ba8ae2ff16d
    // Locators for Instagram login elements (updated to correct XPaths)
    By usernameField = By.name("username"); // Username input field
    By passwordField = By.name("password"); // Password input field
    By loginButton = By.xpath("//button[@type='submit']"); // Login button
<<<<<<< HEAD
>>>>>>> bisam
=======
>>>>>>> d3f2f2e9c30d5009955b34d8566a3ba8ae2ff16d

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
<<<<<<< HEAD
<<<<<<< HEAD
=======
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10-second timeout
>>>>>>> bisam
=======
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10-second timeout
>>>>>>> d3f2f2e9c30d5009955b34d8566a3ba8ae2ff16d
    }

    // Navigate to Instagram login page
    public void goToLoginPage() {
        driver.get("https://www.instagram.com/accounts/login/");
    }

    // Enter username
    public void enterUsername(String username) {
<<<<<<< HEAD
<<<<<<< HEAD
        driver.findElement(usernameField).sendKeys(username);
=======
        WebElement userField = wait.until(ExpectedConditions.elementToBeClickable(usernameField));
        userField.sendKeys(username);
>>>>>>> bisam
=======
        WebElement userField = wait.until(ExpectedConditions.elementToBeClickable(usernameField));
        userField.sendKeys(username);
>>>>>>> d3f2f2e9c30d5009955b34d8566a3ba8ae2ff16d
    }

    // Enter password
    public void enterPassword(String password) {
<<<<<<< HEAD
<<<<<<< HEAD
        driver.findElement(passwordField).sendKeys(password);
=======
        WebElement passField = wait.until(ExpectedConditions.elementToBeClickable(passwordField));
        passField.sendKeys(password);
>>>>>>> bisam
=======
        WebElement passField = wait.until(ExpectedConditions.elementToBeClickable(passwordField));
        passField.sendKeys(password);
>>>>>>> d3f2f2e9c30d5009955b34d8566a3ba8ae2ff16d
    }

    // Click login button
    public void clickLogin() {
<<<<<<< HEAD
<<<<<<< HEAD
        driver.findElement(loginButton).click();
=======
        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginBtn.click();
>>>>>>> bisam
=======
        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginBtn.click();
>>>>>>> d3f2f2e9c30d5009955b34d8566a3ba8ae2ff16d
    }
}
