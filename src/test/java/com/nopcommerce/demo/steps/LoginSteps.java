package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I click on login link")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    @Then("I should navigate to login page successfully")
    public void iShouldNavigateToLoginPageSuccessfully() {
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = new LoginPage().verifyWelcomeText();
        Assert.assertEquals(actualMessage, expectedMessage, "Login page not displayed");
    }

    @And("I enter email {string}")
    public void iEnterEmail(String email) {
        new LoginPage().enterEmailId("jlk3456@gmail.com");
    }

    @And("I enter password {string}")
    public void iEnterPassword(String password) {
        new LoginPage().enterPassword("jkl3456@3456");
    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("I should see the error message {string}")
    public void iShouldSeeTheErrorMessage(String errorMessage) {
        Assert.assertEquals(new LoginPage().verifyErrorMessage(), errorMessage, "Error message not displayed");
    }

    @Then("I should login successfully")
    public void iShouldLoginSuccessfully() {
    }

    @And("I should see the LogOut Link is display")
    public void iShouldSeeTheLogOutLinkIsDisplay() {
        Assert.assertEquals(new LoginPage().verifyLogOutLink(), "Log out", "Text didn't match!");
    }

    @And("I click on logout link")
    public void iClickOnLogoutLink() {
        new LoginPage().clickOnLogOutLink();
    }

    @And("I should see the LogIn Link is display")
    public void iShouldSeeTheLogInLinkIsDisplay() {
        Assert.assertEquals(new HomePage().verifyLogInLink(), "Log in", "Text didn't match!");
    }
}
