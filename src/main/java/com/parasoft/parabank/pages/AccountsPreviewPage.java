package com.parasoft.parabank.pages;

import com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class AccountsPreviewPage extends Utility {

    By successfulLoginMessage = By.xpath("//h1[contains(text(),'Accounts Overview')]");
    By logOutBtn = By.xpath("//a[contains(text(),'Log Out')]");
    By successMessage = By.xpath("//p[contains(text(),'Your account was created successfully. You are now')]");

    public String getSuccessMessage(){
        return getTextFromElement(successfulLoginMessage);
    }

    public void clickLogOutButton(){
        clickOnElement(logOutBtn);
    }

    public String getsuccessfulSignUpMessage() {
        return getTextFromElement(successMessage);
    }
}
