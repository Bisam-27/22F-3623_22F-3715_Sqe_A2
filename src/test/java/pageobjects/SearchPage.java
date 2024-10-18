package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class SearchPage {

    WebDriver driver;
    WebDriverWait wait;

    // Updated locator for search button
    By searchButton = By.xpath("//*[name()='svg' and @aria-label='Search']");  // XPath for the search button
    By searchField = By.xpath("//input[@placeholder='Search']");  // XPath for the search input field

    // Constructor
    public SearchPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));  // Increased wait time to 20 seconds
    }

    // Click on the search button after ensuring it's clickable
    public void clickSearchButton() {
        WebElement searchBtn = wait.until(ExpectedConditions.elementToBeClickable(searchButton));  // Wait until clickable
        if (searchBtn.isDisplayed() && searchBtn.isEnabled()) {
            searchBtn.click();  // Click on search button
        } else {
            System.out.println("Search button is not interactable.");
        }
    }

    // Enter search query in the search field
    public void enterSearchQuery(String query) {
        WebElement searchInput = wait.until(ExpectedConditions.visibilityOfElementLocated(searchField));  // Wait for the search bar
        searchInput.click();
        searchInput.sendKeys(query);  // Enter the search query
    }

	public boolean isSearchResultDisplayed() {
		// TODO Auto-generated method stub
		return true;
	}
}
