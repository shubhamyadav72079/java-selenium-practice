package pages;

import base.BrowserAmazon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AmazonHome extends BrowserAmazon {
    public void getBrowserTitle()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleContains("Amazon"));
        String title = driver.getTitle();
        System.out.println("The title is :"+title);
    }
    public void searchProduct(String product)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement searchSpace =
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox")));

        searchSpace.sendKeys(product);

        WebElement searchButton =
                wait.until(ExpectedConditions.elementToBeClickable(By.id("nav-search-submit-button")));

        searchButton.click();
    }
}