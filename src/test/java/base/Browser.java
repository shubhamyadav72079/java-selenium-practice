package base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Browser {

    public WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void setup(){

        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(){

        driver.quit();

    }
}