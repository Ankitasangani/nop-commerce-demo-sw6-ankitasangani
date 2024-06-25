package com.nopcommerce.demo.pages;


import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * 4.DesktopsPage - Desktops text, Sortby, Display, selectProductList Locators and it's actions
 */
public class DesktopsPage extends Utility {

    private static final Logger log = LogManager.getLogger(DesktopsPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Desktops']")
    WebElement desktopHeadingMsg;

    @CacheLookup
    @FindBy(xpath = "//h2[@class='product-title']//a[normalize-space()='Build your own computer']")
    WebElement buildYourOwnCompProductLink;

    @CacheLookup
    @FindBy(id = "products-orderby")
    WebElement sortByDropdown;

    @CacheLookup
    @FindBy(xpath = "products-pagesize")
    WebElement displayDropdown;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='List']")
    WebElement listViewButton;

    public String getDesktopHeading() {
        log.info("Getting desktop title " + desktopHeadingMsg.toString());
        return getTextFromElement(desktopHeadingMsg);
    }

    public void clickOnSortByDropdown(String value) {
        log.info("Clicking on sort by dropdown " + sortByDropdown.toString());
        selectByVisibleTextFromDropDown(sortByDropdown, value);
    }

    public void clickOnDisplayDropdown(String value) {
        log.info("Clicking on display dropdown" + displayDropdown.toString());
        selectByVisibleTextFromDropDown(displayDropdown, value);
    }

    public void clickOnListViewButton() {
        log.info("Clicking on list tab " + listViewButton.toString());
        clickOnElement(listViewButton);
    }

    public void clickOnBuildYourOwnCompLink() {
        log.info("Click on product name Build your own computer" + buildYourOwnCompProductLink.toString());
        clickOnElement(buildYourOwnCompProductLink);
    }
}
