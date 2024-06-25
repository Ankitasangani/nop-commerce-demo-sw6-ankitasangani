package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class BuildYourOwnComputerPageSteps {
    @Then("I click on product name Build your own computer")
    public void iClickOnProductNameBuildYourOwnComputer() {
        new BuildYourOwnComputerPage().clickOnBuildYourOwnComputer();
    }

    @And("I Select processor {string}")
    public void iSelectProcessor(String processor) {
        new BuildYourOwnComputerPage().selectProcessorFromDropdown(processor);
    }

    @And("Select RAM {string}")
    public void selectRAM(String ram) {
        new BuildYourOwnComputerPage().selectRam(ram);
    }

    @And("Select HDD {string}")
    public void selectHDD(String hdd) {
        new BuildYourOwnComputerPage().selectHddRadio(hdd);
    }

    @And("Select OS {string}")
    public void selectOS(String os) {
        new BuildYourOwnComputerPage().selectOs(os);
    }

    @And("Select Software {string}")
    public void selectSoftware(String software) {
        new BuildYourOwnComputerPage().selectCheckBox(software);
    }

    @And("I click on ADD TO CART Button")
    public void iClickOnADDTOCARTButton() {
        new BuildYourOwnComputerPage().clickOnAddToCart();
    }

    @And("I should see The message {string}")
    public void iShouldSeeTheMessage(String message) {
        Assert.assertEquals(new BuildYourOwnComputerPage().verifyShoppingCartMessage(), message, "Text didn't match!");
    }
}
