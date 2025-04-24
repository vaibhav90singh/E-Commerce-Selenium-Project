package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    WebDriver driver;

    By cartButton = By.id("cart");         // Cart icon
    By proceedToCheckout = By.id("checkout");
    By placeOrderButton = By.id("placeOrder");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void checkoutProduct() {
        driver.findElement(cartButton).click();
        driver.findElement(proceedToCheckout).click();
        driver.findElement(placeOrderButton).click();
    }
}
