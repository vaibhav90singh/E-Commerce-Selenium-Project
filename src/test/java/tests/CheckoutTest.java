package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductPage;
import pages.CheckoutPage;
import utils.TestBase;

public class CheckoutTest extends TestBase {

    @Test
    public void completePurchaseTest() {
        HomePage homePage = new HomePage(driver);
        homePage.searchProduct("Smartphone");

        ProductPage productPage = new ProductPage(driver);
        productPage.addFirstProductToCart();

        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.checkoutProduct();

        // Add assertions like "Thank you" page or order confirmation
    }
}
