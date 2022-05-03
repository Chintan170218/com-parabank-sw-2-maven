package com.parasoft.parabank.pages;

import com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {

    By signInText = By.xpath("//h1[contains(text(),'Signing up is easy!')]");
    By firstNameField = By.id("customer.firstName");
    By lastNameField = By.id("customer.lastName");
    By addressField = By.id("customer.address.street");
    By cityField = By.id("customer.address.city");
    By stateField = By.id("customer.address.state");
    By zipCodeField = By.id("customer.address.zipCode");
    By phoneNoField = By.id("customer.phoneNumber");
    By ssnNoField = By.id("customer.ssn");
    By usernameField = By.id("customer.username");
    By passwordField = By.id("customer.password");
    By confirmPasswordField = By.id("repeatedPassword");
    By registerBtn = By.xpath("//tbody/tr[13]/td[2]/input[1]");


    public String getSignInText() {
        return getTextFromElement(signInText);
    }

    public void enterFirstName(String firstname) {
        sendTextToElement(firstNameField, firstname);
    }

    public void enterLastName(String lastname) {
        sendTextToElement(lastNameField, lastname);
    }

    public void enterAddress(String address) {
        sendTextToElement(addressField, address);
    }

    public void enterCity(String city) {
        sendTextToElement(cityField, city);
    }

    public void enterState(String state) {
        sendTextToElement(stateField, state);
    }

    public void enterZipCode(String zipcode) {
        sendTextToElement(zipCodeField, zipcode);
    }

    public void enterPhoneNo(String phoneNo) {
        sendTextToElement(phoneNoField, phoneNo);
    }

    public void enterSSNNo(String ssnNo) {
        sendTextToElement(ssnNoField, ssnNo);
    }

    public void enterUsername(String username) {
        sendTextToElement(usernameField, username);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        sendTextToElement(confirmPasswordField, confirmPassword);
    }

    public void clickRegisterButton() {
        clickOnElement(registerBtn);
    }
}
