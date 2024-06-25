package com.nopcommerce.demo.pages;


import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * 1.LoginPage - Email, password, Login Button and "Welcome, Please Sign In!" text Locators and
 * create appropriate methods for it.
 */
public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement text;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]")
    WebElement error;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logout;


    public String verifyWelcomeText() {
        String message = getTextFromElement(text);
        log.info("Getting text from: " + text.toString());
        return message;
    }

    public void enterEmailId(String emailId) {
        sendTextToElement(emailField, emailId);
        log.info("Enter email id" + emailField.toString());
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
        log.info("Enter Password" + passwordField.toString());
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        log.info("Click on loginButton" + loginButton.toString());
    }

    public String verifyErrorMessage() {
        String message = getTextFromElement(error);
        log.info("Get error message" + error.toString());
        return message;
    }

    public String verifyLogOutLink() {
        String message = getTextFromElement(logout);
        log.info("verify log out link" + logout.toString());
        return message;
    }

    public void clickOnLogOutLink() {
        clickOnElement(logout);
        log.info("Click on logOut link" + logout.toString());
    }
}
