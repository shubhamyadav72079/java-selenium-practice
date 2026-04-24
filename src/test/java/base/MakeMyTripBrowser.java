package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class MakeMyTripBrowser {
    public WebDriver driver;
    @BeforeMethod
    public void browseropen()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/");
    }

    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }
}
