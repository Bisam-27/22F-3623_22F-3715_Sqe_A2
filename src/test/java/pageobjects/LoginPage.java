package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    // Locators for Instagram login elements
    By usernameField = By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input"); // Instagram username input field
    By passwordField = By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input"); // Instagram password input field
    By loginButton = By.xpath("//*[@id=\"loginForm\"]/div/div[3]"); // Instagram login button

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Navigate to Instagram login page
    public void goToLoginPage() {
        driver.get("https://www.instagram.com/accounts/login/");
    }

    // Enter username
    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    // Enter password
    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    // Click login button
    public void clickLogin() {
        driver.findElement(loginButton).click();
    }
}
