package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;

    // Locators for Instagram login elements (updated to correct XPaths)
    By usernameField = By.name("username"); // Username input field
    By passwordField = By.name("password"); // Password input field
    By loginButton = By.xpath("//button[@type='submit']"); // Login button

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10-second timeout
    }

    // Navigate to Instagram login page
    public void goToLoginPage() {
        driver.get("https://www.instagram.com/accounts/login/");
    }

    // Enter username
    public void enterUsername(String username) {
        WebElement userField = wait.until(ExpectedConditions.elementToBeClickable(usernameField));
        userField.sendKeys(username);
    }

    // Enter password
    public void enterPassword(String password) {
        WebElement passField = wait.until(ExpectedConditions.elementToBeClickable(passwordField));
        passField.sendKeys(password);
    }

    // Click login button
    public void clickLogin() {
        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginBtn.click();
    }
}
