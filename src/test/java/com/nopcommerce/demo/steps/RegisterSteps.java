package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterSteps {
    @When("I click on Register link")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("I should see the text Register")
    public void iShouldSeeTheTextRegister() {
        Assert.assertEquals(new RegisterPage().verifyRegisterText(), "Register", "Text didn't match!");
    }

    @Then("I click On Register button")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("I should see the register error message {string} in the firstname field")
    public void iShouldSeeTheRegisterErrorMessageInTheFirstnameField(String firstname) {
        Assert.assertEquals(new RegisterPage().verifyErrorFirstName(), firstname, "Text didn't match!");
    }

    @And("I should see the register error message {string} in the lastname field")
    public void iShouldSeeTheRegisterErrorMessageInTheLastnameField(String lastname) {
        Assert.assertEquals(new RegisterPage().verifyErrorLastName(), lastname, "Text didn't match!");
    }

    @And("I should see the register error message {string} in the email id field")
    public void iShouldSeeTheRegisterErrorMessageInTheEmailIdField(String email) {
        Assert.assertEquals(new RegisterPage().verifyErrorEmail(), email, "Text didn't match!");
    }

    @And("I should see the register error message {string} in the password field")
    public void iShouldSeeTheRegisterErrorMessageInThePasswordField(String password) {
        Assert.assertEquals(new RegisterPage().verifyErrorPassword(), password, "Text didn't match!");
    }

    @And("I select gender")
    public void iSelectGender() {
        new RegisterPage().selectGender();
    }

    @And("I enter firstname")
    public void iEnterFirstname() {
        new RegisterPage().enterFirstName("Ankita");
    }

    @And("I enter lastname")
    public void iEnterLastname() {
        new RegisterPage().enterLastName("Sangi");
    }

    @And("I select day")
    public void iSelectDay() {
        new RegisterPage().selectDay("5");
    }

    @And("I select month")
    public void iSelectMonth() {
        new RegisterPage().selectMonth("4");
    }

    @And("I select year")
    public void iSelectYear() {
        new RegisterPage().selectYear("1995");
    }

    @And("I enter emailId")
    public void iEnterEmailId() {
        new RegisterPage().enterEmailId();
    }

    @And("I enter password {string} in the password field")
    public void iEnterPasswordInThePasswordField(String password) {
        new RegisterPage().enterPassword("Ankita@1995");
    }

    @And("I enter confirm password {string}")
    public void iEnterConfirmPassword(String password) {
        new RegisterPage().enterConfirmPassword("Ankita@1995");
    }

    @Then("I should see the register successfully {string}")
    public void iShouldSeeTheRegisterSuccessfully(String registerMessage) {
        Assert.assertEquals(new RegisterPage().verifyRegistrationMessage(), registerMessage, "Text didn't match!");
    }

}
