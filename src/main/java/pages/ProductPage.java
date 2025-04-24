package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    WebDriver driver;

    By firstProduct = By.cssSelector(".product-item:first-child"); // Sample selector
    By addToCartButton = By.id("add-to-cart");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addFirstProductToCart() {
        driver.findElement(firstProduct).click();
        driver.findElement(addToCartButton).click();
    }
}
