package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.ComputerPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ComputerPageSteps {
    @When("I click on Computer Tab")
    public void iClickOnComputerTab() {
        new ComputerPage().clickOnComputerTab();
    }

    @Then("I should see the text {string}")
    public void iShouldSeeTheText(String textComputer) {
        Assert.assertEquals(new ComputerPage().verifyComputerText(), textComputer, "Text didn't match!");
    }

    @When("I mouse hover on computer tab")
    public void iMouseHoverOnComputerTab() {
        new ComputerPage().mouseHoverOnComputerTab();
    }

    @And("I click on Desktops link")
    public void iClickOnDesktopsLink() {
        new ComputerPage().clickOnDesktopLink();
    }

    @Then("I should see the text {string} in desktops page")
    public void iShouldSeeTheTextInDesktopsPage(String textDesktops) {
        Assert.assertEquals(new ComputerPage().verifyDesktopsText(), textDesktops, "Text didn't match!");
    }

}
