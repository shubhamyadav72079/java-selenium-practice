package pages;

import base.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;

public class waitHandling extends Browser {
    @Test(groups = "smoke")
    public void waitPractice()
    {
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement button=wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//button[text()='Start']")));
//        WebElement button=driver.findElement(By.xpath("//button[text()='Start']"));
        button.click();

        WebElement text = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//h4[text()='Hello World!']")));
//        WebElement text=driver.findElement(By.xpath("//h4[text()='Hello World!']"));
        System.out.println(text.getText());
    }
}
