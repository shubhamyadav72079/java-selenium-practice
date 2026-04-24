package test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.FlipkartSearch;

public class FlipkartTest extends FlipkartSearch {
    @Test(dataProvider = "products")
    public void flipkartSearchTest(String product) {

        closePopUp();

        searchProduct(product);

        applyFilter();

        sortResults();

        int count = getProductCount();

        System.out.println("Product count: " + count);

        Assert.assertTrue(count > 0);

    }

    @DataProvider(name = "products")
    public Object[][] data() {

        return new Object[][]{

                {"mobile"},
                {"iphone"},
                {"samsung"}

        };

    }
}
