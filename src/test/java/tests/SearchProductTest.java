package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import utils.TestBase;

public class SearchProductTest extends TestBase {

    @Test
    public void searchProductTest() {
        HomePage homePage = new HomePage(driver);
        homePage.searchProduct("Laptop");
        // Add assertions like verifying search results loaded
    }
}
