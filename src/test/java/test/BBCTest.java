package test;

import base.BBCBrowser;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BBCHome;
import utils.BBCData;

import java.util.List;

public class BBCTest extends BBCBrowser {
    @Test(dataProvider = "articleName", dataProviderClass = BBCData.class)
    public void newsSearchTest(String topic) {

        BBCHome page = new BBCHome(driver);
        page.searchProcess(topic);
        List<WebElement> results = page.getResults();
        Assert.assertTrue(results.size() > 0, "No results found");
        for (WebElement article : results) {
            String title = article.getText();
            System.out.println("Title: " + title);
            Assert.assertFalse(title.trim().isEmpty(), "Title is empty");
        }
        page.openFirstArticle();
        WebElement articleContent = page.getArticleContent();
        Assert.assertTrue(articleContent.isDisplayed(), "Article not visible");
    }
}