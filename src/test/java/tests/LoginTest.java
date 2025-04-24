package tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import utils.TestBase;

public class LoginTest extends TestBase {

    @Test
    public void validLoginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("testuser@example.com", "password123");
        // Add assertions after login
    }
    
    // Updation to test invalid credential
    @Test
public void invalidLoginTest() {
    LoginPage loginPage = new LoginPage(driver);
    loginPage.login("invalid@example.com", "wrongpassword");

    // Example: check error message (update selector accordingly)
    String errorMessage = driver.findElement(By.id("login-error")).getText();
    Assert.assertTrue(errorMessage.contains("Invalid"), "Error message not shown!");
}

// @Data Provider Updation

@DataProvider(name = "loginData")
public Object[][] loginData() {
    return ExcelReader.getExcelData("data/LoginData.xlsx", "Sheet1");
}

@Test(dataProvider = "loginData")
public void loginWithExcelData(String email, String password) {
    LoginPage loginPage = new LoginPage(driver);
    loginPage.login(email, password);
    // Add assertions based on expected results
}

}
