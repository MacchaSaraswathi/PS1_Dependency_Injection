package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    // Locators
    private By emailInputLocator = By.id("Email");
    private By passwordInputLocator = By.id("Password");
    private By loginButtonLocator = By.cssSelector(".button-1.login-button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Getters for locators
    public WebElement getEmailInput() {
        return driver.findElement(emailInputLocator);
    }

    public WebElement getPasswordInput() {
        return driver.findElement(passwordInputLocator);
    }

    public WebElement getLoginButton() {
        return driver.findElement(loginButtonLocator);
    }
}
