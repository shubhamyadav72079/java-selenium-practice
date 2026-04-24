package pages;//package pages;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//
//////package pages;
//////
//////import org.openqa.selenium.By;
//////import org.openqa.selenium.WebElement;
//////import org.openqa.selenium.chrome.ChromeDriver;
//////import org.openqa.selenium.support.ui.ExpectedConditions;
//////import org.openqa.selenium.support.ui.WebDriverWait;
//////
//////import java.time.Duration;
//////
//////public class check {
//////    String checkIn="23";
//////    public static void main(String[] args) {
//////        ChromeDriver driver=new ChromeDriver();
//////        driver.manage().window().maximize();
//////        driver.get("https://www.booking.com/");
//////        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//////        WebElement close =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='bbe73dce14']")));
//////        close.click();
//////
//////        WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(
//////                By.name("ss")));
//////        searchBox.clear();
//////        searchBox.sendKeys("Hydrabad");
//////        WebElement date = wait.until(ExpectedConditions.elementToBeClickable(
//////                By.name("//span[@data-testid='date-display-field-start']")));
//////        wait.until(ExpectedConditions.elementToBeClickable(
//////                By.xpath("//span[@data-date='" + checkIn + "']")
//////        )).click();
//////
//////    }
//////}
////package pages;
////
////import org.openqa.selenium.By;
////import org.openqa.selenium.Keys;
////import org.openqa.selenium.WebElement;
////import org.openqa.selenium.chrome.ChromeDriver;
////import org.openqa.selenium.interactions.Actions;
////import org.openqa.selenium.support.ui.ExpectedConditions;
////import org.openqa.selenium.support.ui.WebDriverWait;
////
////import java.time.Duration;
////
////public class check {
////
////    public static void main(String[] args) throws InterruptedException {
////
////        ChromeDriver driver = new ChromeDriver();
////        driver.manage().window().maximize();
////        driver.get("https://www.booking.com/");
////
////        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
////        try {
////            Actions actions = new Actions(driver);
////            actions.sendKeys(Keys.ESCAPE).perform();
////        } catch (Exception e) {
////            System.out.println("No popup");
////        }
////        var searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.name("ss")));
////        searchBox.sendKeys("Hyderabad");
////
////        // wait for suggestions
////        WebElement a=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@role='button'])[1]")));
////        a.click();
////
////        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@role='option']")));
////        searchBox.sendKeys(Keys.ARROW_DOWN);
////        searchBox.sendKeys(Keys.ENTER);
////
////        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//li[@role='option']")));
////
////        // ✅ Click date field
////        var dateField = wait.until(ExpectedConditions.elementToBeClickable(
////                By.xpath("//span[contains(text(),'Check-in')]")
////        ));
////        dateField.click();
////
////        // ✅ Select dates (use FULL date format)
////        String checkIn = "2026-04-23";
////        String checkOut = "2026-04-25";
////
////        wait.until(ExpectedConditions.elementToBeClickable(
////                By.xpath("//span[@data-date='" + checkIn + "']")
////        )).click();
////
////        wait.until(ExpectedConditions.elementToBeClickable(
////                By.xpath("//span[@data-date='" + checkOut + "']")
////        )).click();
////
////    }
////}
//
//public class check {
//    public static void main(String[] args) {
//        ChromeOptions options = new ChromeOptions();
//
//        options.addArguments("--disable-blink-features=AutomationControlled");
//        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
//        options.setExperimentalOption("useAutomationExtension", false);
//        options.addArguments("start-maximized");
//
//        WebDriver driver = new ChromeDriver(options);
//        driver.get("https://www.swiggy.com/");
//        driver.manage().window().maximize();
//    driver.get("https://www.swiggy.com/");
//    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//    WebElement location = wait.until(ExpectedConditions.visibilityOfElementLocated
//            (By.id("location")));
//    location.sendKeys("Hydrabad");
//    wait.until(ExpectedConditions.elementToBeClickable
//            (By.xpath("(//span[@class='_2OORn'])[1]"))).click();
//        WebElement hotelName=wait.until(ExpectedConditions.visibilityOfElementLocated
//                (By.xpath("//div[text()='Search for restaurant, item or more']")));
//        hotelName.click();
////        sendKeys("Srikanya");
//        wait.until(ExpectedConditions.visibilityOfElementLocated
//                (By.xpath("(//div[@data-testid='search-pl-restaurant-card'])[1]"))).click();
//

import base.BrowserAmazon;

////        (//div[@data-testid='search-pl-restaurant-card'])[1]
//}
//    }

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//
//import java.time.Duration;
//
//public class check {
//    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.amazon.in");
//        driver.manage().window().maximize();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        try {
//            WebElement searchBox = wait.until(
//                    ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox")));
//            searchBox.sendKeys("laptop");
//            System.out.println("Wait Test: PASS");
//        } catch (Exception e) {
//            System.out.println("Wait Test: FAIL");
//        }
//        driver.quit();
//    }
//}
public class check extends BrowserAmazon {
    public void getBrowserTitle()
  {
        String title = driver.getTitle();
        System.out.println("Page title :"+title);
  }
}