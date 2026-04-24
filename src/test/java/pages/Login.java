package pages;

import base.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login extends Browser {
    @Test(dataProvider = "LoginData", dataProviderClass = utils.loginData.class ,groups = "regression")
    public void Login(String username,String password,String expectedMessage) {
        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.className("radius")).click();

        WebElement text = driver.findElement(By.id("flash"));
        String toverify = text.getText();

        if (toverify.contains(expectedMessage)) {
            System.out.println("Test case passed");
        } else {
            System.out.println("Test case failed");
        }

    }


//
//    @Test
//    public void validLogin() {
//        driver.get("https://the-internet.herokuapp.com/login");
//        driver.findElement(By.id("username")).sendKeys("tomsmith");
//        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
//        driver.findElement(By.className("radius")).click();
//
//        WebElement text = driver.findElement(By.id("flash"));
//        String toverify = text.getText();
//
//        if (toverify.contains("You logged into a secure area!")) {
//            System.out.println("Test case passed");
//        }
//
//    }
//    @Test
//    public void inValidLogin()
//    {
//        driver.get("https://the-internet.herokuapp.com/login");
//        driver.findElement(By.id("username")).sendKeys("tomsmith");
//        driver.findElement(By.id("password")).sendKeys("SuperSecret");
//        driver.findElement(By.className("radius")).click();
//        WebElement text = driver.findElement(By.id("flash"));
//        String toverify = text.getText();
//
//        if (toverify.contains(" Your password is invalid!")) {
//            System.out.println("Test case passed");
//        }
//    }
//    @Test
//    public void emptyUserName()
//    {
//        driver.get("https://the-internet.herokuapp.com/login");
//        driver.findElement(By.id("username")).sendKeys("");
//        driver.findElement(By.id("password")).sendKeys("SuperSecret");
//        driver.findElement(By.className("radius")).click();
//        WebElement text = driver.findElement(By.id("flash"));
//        String toverify = text.getText();
//
//        if (toverify.contains(" Your username is invalid!")) {
//            System.out.println("Test case passed");
//        }
//    }
}