package com.nopcommerce.demo.pages;


import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * 6.RegisterPage - Register Text, male female radio, Firstname, lastname, Date of Birth drop
 * down, email, Password, Confirm Password, Register Button, "First name is required.","Last name
 * is required.", "Email is required.","Password is required.", "Password is required." error message,
 * "Your registration completed" message, "CONTINUE" button
 * Locators and it's actions
 */
public class RegisterPage extends Utility {

    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement registerText;

    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;

    @CacheLookup
    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement error1;

    @CacheLookup
    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement error2;

    @CacheLookup
    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement error3;

    @CacheLookup
    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement error4;

    @CacheLookup
    @FindBy(xpath = "//input[@id='gender-female']")
    WebElement gender;

    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstname;

    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastname;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement eMail;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[1]")
    WebElement dy;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[2]")
    WebElement mnth;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[3]")
    WebElement yer;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement pasword;

    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPasword;

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement completed;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueButton;


    public String verifyRegisterText() {
        String message = getTextFromElement(registerText);
        log.info("Getting text from: " + registerText.toString());
        return message;
    }

    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
        log.info("Click on Register Button" + registerButton.toString());
    }

    public String verifyErrorFirstName() {
        String message = getTextFromElement(error1);
        log.info("Get error message" + error1.toString());
        return message;
    }

    public String verifyErrorLastName() {
        String message = getTextFromElement(error2);
        log.info("Get error message" + error2.toString());
        return message;
    }

    public String verifyErrorEmail() {
        String message = getTextFromElement(error3);
        log.info("Get error message" + error3.toString());
        return message;
    }

    public String verifyErrorPassword() {
        String message = getTextFromElement(error4);
        log.info("Get error message" + error4.toString());
        return message;
    }

    public void selectGender() {
        clickOnElement(gender);
        log.info("Select gender female" + gender.toString());
    }

    public void enterFirstName(String firstName) {
        sendTextToElement(firstname, firstName);
        log.info("Enter first name" + firstname.toString());
    }

    public void enterLastName(String lastName) {
        sendTextToElement(lastname, lastName);
        log.info("Enter last name" + lastname.toString());
    }

    public void selectDay(String day) {
        selectByValueFromDropDown(dy, day);
        log.info("Select day" + dy.toString());
    }

    public void selectMonth(String month) {
        selectByValueFromDropDown(mnth, month);
        log.info("Select month" + mnth.toString());
    }

    public void selectYear(String year) {
        selectByValueFromDropDown(yer, year);
        log.info("Select year" + yer.toString());
    }

    public void enterEmailId() {
        String userName = "" + (int) (Math.random() * Integer.MAX_VALUE);  //Create random username
        String emailID = "User" + userName + "@example.com";   //Create random email Id
        sendTextToElement(eMail, emailID);
        log.info("Enter email id" + eMail.toString());
    }

    public void enterPassword(String password) {
        sendTextToElement(pasword, password);
        log.info("Enter password" + pasword.toString());
    }

    public void enterConfirmPassword(String confirmPassword) {
        sendTextToElement(confirmPasword, confirmPassword);
        log.info("Enter confirmPassword" + confirmPasword.toString());
    }

    public String verifyRegistrationMessage() {
        String message = getTextFromElement(completed);
        log.info("Get error message" + completed.toString());
        return message;
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
        log.info("Click on continue Button" + continueButton.toString());
    }

}
