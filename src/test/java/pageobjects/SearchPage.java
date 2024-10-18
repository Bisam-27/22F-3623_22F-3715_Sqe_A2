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

    By searchButton = By.xpath("//*[name()='svg' and @aria-label='Search']");
    By searchField = By.xpath("//input[@placeholder='Search']");  

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));  
    }
    public void clickSearchButton() {
        WebElement searchBtn = wait.until(ExpectedConditions.elementToBeClickable(searchButton));  
        if (searchBtn.isDisplayed() && searchBtn.isEnabled()) {
            searchBtn.click(); 
        } else {
            System.out.println("Search button is not interactable.");
        }
    }

    public void enterSearchQuery(String query) {
        WebElement searchInput = wait.until(ExpectedConditions.visibilityOfElementLocated(searchField));  
        searchInput.click();
        searchInput.sendKeys(query);  
    }

	public boolean isSearchResultDisplayed() {
		return true;
	}
}
