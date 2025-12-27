package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtils {
    public  static final int DEFAULT_TIMEOUT=10;
    public static void sleep(int seconds){
        try {
            long milli = seconds * 1000L;
            Thread.sleep(milli);
        }catch (Exception e){
            System.out.println("error while waiting for the element");
        }
    }
    public static WebElement waitForTheElementVisibility(WebDriver driver,WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIMEOUT));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }
    public static WebElement waitForElementToBeClickable(WebDriver driver,WebElement element){
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(DEFAULT_TIMEOUT));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public  static boolean waitForInvisibility(WebDriver driver,WebElement element){
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(DEFAULT_TIMEOUT));
        return wait.until(ExpectedConditions.invisibilityOf(element));
    }
}
