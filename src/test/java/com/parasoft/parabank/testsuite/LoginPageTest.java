package com.parasoft.parabank.testsuite;


import com.parasoft.parabank.pages.AccountsPreviewPage;
import com.parasoft.parabank.pages.HomePage;
import com.parasoft.parabank.pages.RegisterPage;
import com.parasoft.parabank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    AccountsPreviewPage accountsPreviewPage = new AccountsPreviewPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        homePage.enterUserName("Chin123");
        homePage.enterPassword("Chin123");
        homePage.clickOnLoginLink();
        String expectedMessage = "Accounts Overview";
        String actualMessage = accountsPreviewPage.getSuccessMessage();
        Assert.assertEquals( expectedMessage, actualMessage,"Text does not match expected text");
    }

    @Test
    public void verifyTheErrorMessage(){
        homePage.enterUserName("Chin123456");
        homePage.enterPassword("");
        homePage.clickOnLoginLink();
        String expectederrorMessage = "Please enter a username and password.";
        String actualerrorMessage = homePage.getErrorMessage();
        Assert.assertEquals( expectederrorMessage, actualerrorMessage,"Text does not match expected text");
    }

    @Test
    public void userShouldLogOutSuccessfully(){
        homePage.enterUserName("Chin123");
        homePage.enterPassword("Chin123");
        homePage.clickOnLoginLink();
        String expectedMessage = "Accounts Overview";
        String actualMessage = accountsPreviewPage.getSuccessMessage();
        Assert.assertEquals( expectedMessage, actualMessage,"Text does not match expected text");
        accountsPreviewPage.clickLogOutButton();
        String expectedMessage2 = "Customer Login";
        String actualMessage2 = homePage.getCustomerLoginText();
        Assert.assertEquals( expectedMessage, actualMessage,"Text does not match expected text");
    }
}