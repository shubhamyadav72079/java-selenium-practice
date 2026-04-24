package pages;

import base.MakeMyTripBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MakeMyTripHome {
    WebDriver driver;
    WebDriverWait wait;

    public MakeMyTripHome(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

public void closePopUP()
{
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    try {
        WebElement popUp = wait.until(ExpectedConditions.elementToBeClickable
                (By.xpath("//span[@data-cy='closeModal']")));

        popUp.click();
    }catch (Exception e) {
        System.out.println("Popup not appeared");
    }

}
    public void selectFromCity(String city) {
        driver.findElement(By.id("fromCity")).click();

        WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@placeholder='From']")));
        input.sendKeys(city);

        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//p[contains(text(),'" + city + "')]"))).click();
    }

    public void selectToCity(String city) {
        driver.findElement(By.id("toCity")).click();

        WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@placeholder='To']")));
        input.sendKeys(city);

        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//p[contains(text(),'" + city + "')]"))).click();
    }
}
