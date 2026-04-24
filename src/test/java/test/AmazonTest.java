package test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonProduct;

public class AmazonTest extends AmazonProduct {

    @Test(dataProvider = "products")
    public void searchProductTest(String product)
    {
        getBrowserTitle();
        searchProduct(product);

        clickFirstProduct();

        switchToProductTab();

        String title = getTitle();

        Assert.assertTrue(title.toLowerCase().contains(product));

        addToCart();

        openCart();
    }

    @DataProvider(name = "products")
    public Object[][] productData() {

        return new Object[][] {
                {"laptop"},
                {"headphones"},
                {"keyboard"}
        };
    }
}