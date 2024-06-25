Feature: Register
  In Order to perform successful Register
  As a User
  I have to enter correct details

  @author_Ankita @smoke @sanity @regression
  Scenario: Verify User Should Navigate To Register Page Successfully
    Given I am on homepage
    When I click on Register link
    Then I should see the text Register

  @author_Ankita @smoke @regression
  Scenario: Verify That FirstName LastName Email Password And ConfirmPassword Fields Are Mandatory
    Given I am on homepage
    When I click on Register link
    And I click On Register button
    Then I should see the register error message "First name is required." in the firstname field
    And I should see the register error message "Last name is required." in the lastname field
    And I should see the register error message "Email is required." in the email id field
    And I should see the register error message "Password is required." in the password field

  @author_Ankita @regression
  Scenario: Verify That User Should Create Account Successfully
    Given I am on homepage
    When I click on Register link
    And I select gender
    And I enter firstname
    And I enter lastname
    And I select day
    And I select month
    And I select year
    And I enter emailId
    And I enter password "<password>" in the password field
    And I enter confirm password "<Password>"
    And I click On Register button
    Then I should see the register successfully "<message>"






