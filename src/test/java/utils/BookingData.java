package utils;

import org.testng.annotations.DataProvider;

public class BookingData {

    @DataProvider(name = "hotelData")
    public Object[][] getData() {
        return new Object[][] {
                {"Hyderabad", "2026-04-10", "2026-04-15"},
                {"Bangalore", "2026-05-01", "2026-05-05"}
        };
    }
}