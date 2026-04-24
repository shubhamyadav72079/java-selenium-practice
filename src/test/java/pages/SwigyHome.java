package pages;

import base.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SwigyHome extends Browser {


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        public void openBrowser ()
        {
            driver.get("https://www.swiggy.com/");
        }
        public void submitLoaction ()
        {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement location = wait.until(ExpectedConditions.visibilityOfElementLocated
                    (By.id("location")));
            location.sendKeys("Hydrabad");
            wait.until(ExpectedConditions.elementToBeClickable
                    (By.xpath("(//span[@class='_2OORn'])[1]"))).click();

        }
    }

