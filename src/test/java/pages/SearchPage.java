package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
    private WebDriver driver;

    // Locators
    private By searchTextboxLocator = By.id("small-searchterms");
    private By searchButtonLocator = By.cssSelector(".button-1.search-box-button");

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    // Getters for locators
    public WebElement getSearchTextbox() {
        return driver.findElement(searchTextboxLocator);
    }

    public WebElement getSearchButton() {
        return driver.findElement(searchButtonLocator);
    }
}