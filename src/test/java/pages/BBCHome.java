//package pages;
//import org.openqa.selenium.*;
//import org.openqa.selenium.support.ui.*;
//
//import java.time.Duration;
//import java.util.List;
//
//public class BBCHome {
//
//    WebDriver driver;
//    WebDriverWait wait;
//    public BBCHome(WebDriver driver) {
//        this.driver = driver;
//        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//    }
//    public void serchProcess(String option) {
//            WebElement serch = driver.findElement(
//                    By.xpath("//button[@aria-label='Open menu']"));
//            serch.click();
//        }
//        WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(
//                By.xpath("//input[@placeholder='Search news, topics and more']")));
//        searchBox.sendKeys(option);
//        WebElement button=wait.until(ExpectedConditions.visibilityOfElementLocated(
//                By.xpath("//button[@aria-label='Search']")));
//        button.click();
//    }
//
//    public void selectNews() {
//        WebElement NewsButton=wait.until(ExpectedConditions.elementToBeClickable
//                (By.xpath("(//a[text()='News'])[1]")));
//        NewsButton.click();
//    }
//    public List<WebElement> getResults() {
//        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
//                By.xpath("//a[contains(@href,'/news')]//span")
//        ));
//    }
//
//    public void openFirstArticle() {
//        List<WebElement> articles = getResults();
//        articles.get(0).click();
//    }
//    public WebElement getArticleContent() {
//        return wait.until(ExpectedConditions.visibilityOfElementLocated(
//                By.xpath("//article")
//        ));
//    }
//}



package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;
import java.util.List;

public class BBCHome {

    WebDriver driver;
    WebDriverWait wait;
    public BBCHome(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
    public void handlePopup() {
        try {
            WebElement accept = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//button[contains(.,'Accept')]")
            ));
            accept.click();
        } catch (Exception e) {
        }
    }
    public void searchProcess(String option) {

        handlePopup();

        // Step 1: Click menu
        WebElement menu = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[@aria-label='Open menu']")));
        menu.click();

        // Step 2: Click search icon
        WebElement searchIcon = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[@aria-label='Search']")));
        searchIcon.click();

        // Step 3: Enter text
        WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@placeholder='Search news, topics and more']")));
        searchBox.sendKeys(option);

        // Step 4: Submit search
        searchBox.sendKeys(Keys.ENTER);

        // Wait for results page
        wait.until(ExpectedConditions.urlContains("search"));
    }

    // Click News tab
    public void selectNews() {

        WebElement news = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//nav//a[contains(@href,'/news')]")
        ));

        news.click();
    }

    // Get results
    public List<WebElement> getResults() {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
                By.xpath("//a[contains(@href,'/news')]")));
    }

    // Open first article
    public void openFirstArticle() {
        List<WebElement> articles = getResults();
        if (!articles.isEmpty()) {
            articles.get(0).click();
        }
    }

    // Validate article content
    public WebElement getArticleContent() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//article")));
    }
}