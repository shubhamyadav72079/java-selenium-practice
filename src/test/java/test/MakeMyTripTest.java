package test;

import base.MakeMyTripBrowser;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MakeMyTripHome;
import utils.MakeMyTripData;
public class MakeMyTripTest extends MakeMyTripBrowser {

    @Test(dataProvider = "flightData", dataProviderClass = MakeMyTripData.class)
    public void flightSearchTest(String from, String to) {

        MakeMyTripHome home = new MakeMyTripHome(driver);

        home.closePopUP();

        home.selectFromCity(from);
        home.selectToCity(to);

        String currentURL = driver.getCurrentUrl();

        Assert.assertTrue(currentURL.contains("makemytrip"),
                "URL validation failed");

        System.out.println("Test Passed for: " + from + " → " + to);
    }
}