package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductPage;
import utils.TestBase;

public class AddToCartTest extends TestBase {

    @Test
    public void addToCartFlowTest() {
        HomePage homePage = new HomePage(driver);
        homePage.searchProduct("Headphones");

        ProductPage productPage = new ProductPage(driver);
        productPage.addFirstProductToCart();

        // Add assertions for cart confirmation message
    }
}
