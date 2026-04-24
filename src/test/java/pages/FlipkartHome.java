package pages;

import base.FlipkartBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FlipkartHome extends FlipkartBrowser {
    By closePopUp= By.xpath("//button[contains(text(),'✕')]");
    By searchBox=By.name("q");

    public void closePopUp()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {

            wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//button[contains(text(),'✕')]")
            )).click();

        }
        catch (Exception e)
        {
            System.out.println("Login popup not displayed");
        }
    }

    public void searchProduct(String product)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q"))).sendKeys(product);
        driver.findElement(By.name("q")).submit();
    }

}
