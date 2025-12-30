package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WaitUtils;

public class LoginPage {
    private WebDriver driver;
    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton   = By.id("login");


    LoginPage(WebDriver driver) {
        this.driver=driver;
    }
        public LoginPage enterUsername (String username){
            WaitUtils.waitForElementToBeClickable(driver,driver.findElement(usernameField));
            driver.findElement(usernameField).sendKeys(username);
            System.out.println("user name added");
            return this;
        }
        public LoginPage enterPassword (String password){
        WaitUtils.waitForTheElementVisibility(driver,driver.findElement(passwordField));
            driver.findElement(passwordField).sendKeys(password);
            System.out.println("password added");
            return this;
        }
        public LoginPage clickLogin () {
            WaitUtils.waitForElementToBeClickable(driver,driver.findElement(loginButton));
            driver.findElement(loginButton).click();
            System.out.println("clicked login");
            return this;
        }
    }

