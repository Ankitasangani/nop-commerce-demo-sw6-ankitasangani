package com.nopcommerce.demo.pages;


import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * 2.HomePage - All Menu (Seven menu), LoginLink, registerLink, nopcommerce logo, My account
 * link and LogOut link locators and create appropriate methods for it.
 */
public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    WebElement loginLink;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement registerLink;

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
        log.info("Click on login link" + loginLink.toString());
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
        log.info("Click on Register Link" + registerLink.toString());
    }

    public String verifyLogInLink() {
        String message = getTextFromElement(loginLink);
        log.info("Get error message" + loginLink.toString());
        return message;
    }
}
