package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WaitUtils;
public class SamplePage {
        private WebDriver driver;
        private WebElement sampleButton; // assume this is initialized later

        public SamplePage(WebDriver driver) {
            this.driver = driver;
        }

        public void clickSampleButton() {
            WaitUtils.waitForElementToBeClickable(driver, sampleButton).click();
        }
    }


