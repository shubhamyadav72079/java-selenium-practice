package utils;

import org.testng.annotations.DataProvider;

public class MakeMyTripData {
    @DataProvider(name = "flightData")
    public Object[][] data() {
        return new Object[][] {
                {"Delhi", "Mumbai"},
                {"Hyderabad", "Bangalore"}
        };
    }
}
