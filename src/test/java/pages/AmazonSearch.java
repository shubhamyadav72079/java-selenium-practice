package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class AmazonSearch extends AmazonHome {
    By firstProduct =
            By.xpath("(//div[@data-component-type='s-search-result'])[1]//h2//span");

    public void clickFirstProduct()
    {
        driver.findElement(firstProduct).click();
    }
    public void switchToProductTab()
    {
        Set<String> windows = driver.getWindowHandles();

        for(String window : windows) {

            driver.switchTo().window(window);

        }

    }

}
