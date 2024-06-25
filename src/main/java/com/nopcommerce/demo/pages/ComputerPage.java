package com.nopcommerce.demo.pages;


import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * 3.ComputerPage - Computers text, DesktopsLink, NotebooksLink, SoftwareLink Locators and
 * create appropriate methods for it.
 */

public class ComputerPage extends Utility {

    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[1]/a[1]")
    WebElement computerTab;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Computers')]")
    WebElement computerText;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
    WebElement desktopLink;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Desktops')]")
    WebElement desktopText;


    public void clickOnComputerTab() {
        clickOnElement(computerTab);
        log.info("Click on Computer Tab" + computerTab.toString());
    }

    public String verifyComputerText() {
        String message = getTextFromElement(computerText);
        log.info("Get error message" + computerText.toString());
        return message;
    }

    public void mouseHoverOnComputerTab() {
        mouseHoverToElement(computerTab);
        log.info("Click on Computer Tab" + computerTab.toString());
    }

    public void clickOnDesktopLink() {
        clickOnElement(desktopLink);
        log.info("Click on desktop Link" + desktopLink.toString());
    }

    public String verifyDesktopsText() {
        String message = getTextFromElement(desktopText);
        log.info("Get error message" + desktopText.toString());
        return message;
    }

}
