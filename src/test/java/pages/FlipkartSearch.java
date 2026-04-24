package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class FlipkartSearch extends FlipkartHome{
    By ratingFilter = By.xpath("//div[text()='4★ & above']");
    By sortHighToLow = By.xpath("//div[contains(text(),'Price -- High to Low')]");
    By productTitles = By.xpath("//div[@class='_4rR01T']");

    public void applyFilter()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // scroll to filters section
        js.executeScript("window.scrollBy(0,800)");

        WebElement rating = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//span[text()='4★ & above']")));
        rating.click();
    }

    public void sortResults() {

        driver.findElement(sortHighToLow).click();

    }

    public int getProductCount() {

        List<WebElement> products = driver.findElements(productTitles);

        return products.size();

    }
}
