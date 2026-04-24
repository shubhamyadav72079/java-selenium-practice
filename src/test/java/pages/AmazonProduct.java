package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AmazonProduct extends AmazonSearch{

    By productTitle = By.id("productTitle");
    By addToCart = By.id("add-to-cart-button");
    By cart = By.id("nav-cart");

    public String getTitle()
    {
       return driver.findElement(productTitle).getText();
    }
    public void addToCart()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        try {

            wait.until(ExpectedConditions.elementToBeClickable(addToCart)).click();
            System.out.println("Add to Cart clicked");
        } catch (Exception e1) {

            try {

                By buyNow = By.id("buy-now-button");
                wait.until(ExpectedConditions.elementToBeClickable(buyNow)).click();
                System.out.println("Buy Now clicked");

            } catch (Exception e2) {

                try {

                    By buyingOptions = By.xpath("//span[contains(text(),'See All Buying Options')]");
                    wait.until(ExpectedConditions.elementToBeClickable(buyingOptions)).click();
                    System.out.println("Buying options opened");

                } catch (Exception e3) {

                    System.out.println("No purchase option available for this product");

                }

            }

        }
    }
    public void openCart()
    {
        driver.findElement(cart).click();
    }
}
