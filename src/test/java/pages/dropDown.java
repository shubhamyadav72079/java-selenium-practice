package pages;

import base.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class dropDown extends Browser {
    @Test(groups = "regression")
    public void dropDown()
    {
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement option=driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select select=new Select(option);
        select.selectByVisibleText("Option 1");
        String select1=select.getFirstSelectedOption().getText();
        if (select1.equals("Option 1"))
        {
            System.out.println("The first option selected");
        }
    }
}
