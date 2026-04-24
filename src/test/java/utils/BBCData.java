package utils;

import org.testng.annotations.DataProvider;

public class BBCData {

    @DataProvider(name = "articleName")
    public static Object[][] getData() {
        return new Object[][]{
                {"Technology"},
                {"AI"},
                {"India"}
        };
    }
}