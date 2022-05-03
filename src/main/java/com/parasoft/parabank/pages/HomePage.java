package com.parasoft.parabank.pages;

import com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By customerLogintxt = By.xpath("//h2[contains(text(),'Customer Login')]");
    By loginLink = By.xpath("//input[@value=\"Log In\"]");
    By registerLink = By.xpath("//a[text()='Register']");
    By userNameField = By.xpath("//input[@name=\"username\"]");
    By passwordField = By.xpath("//input[@name=\"password\"]");
    By errorMessage = By.xpath("//p[contains(text(),'Please enter a username and password.')]");

    public String getCustomerLoginText(){
        return getTextFromElement(customerLogintxt);
    }

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
    }

    public void enterUserName(String username) {
        sendTextToElement(userNameField, username);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public String getErrorMessage(){
        return getTextFromElement(errorMessage);
    }
}
