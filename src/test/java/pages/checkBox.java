package pages;

import base.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class checkBox extends Browser {
    @Test(groups = "regression")
    public void checkBoxMethod()
    {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        WebElement checkbox1=driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        checkbox1.click();
        if (checkbox1.isSelected())
        {
            System.out.println("The first checkbox is selected");
        }
        WebElement secondCheckBox=
        driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        secondCheckBox.click();
        if (!secondCheckBox.isSelected())
        {
            System.out.println("the check box is not selected");
        }
    }

}
