Feature: Computer Page
  In Order to perform Add to cart product successfully
  As a User
  I have to enter correct details

  @author_Ankita @smoke @sanity @regression
  Scenario: Verify User Should Navigate To ComputerPage Successfully
    Given I am on homepage
    When I click on Computer Tab
    Then I should see the text "Computers"

  @author_Ankita @smoke @regression
  Scenario: Verify User Should Navigate To Desktops Page Successfully
    Given I am on homepage
    When I mouse hover on computer tab
    And I click on Desktops link
    Then I should see the text "Desktops" in desktops page

  @author_Ankita @regression
  Scenario Outline: Verify That User Should Build Your Own Computer And Add Them To Cart Successfully
    Given I am on homepage
    When I mouse hover on computer tab
    And I click on Desktops link
    Then I click on product name Build your own computer
    And I Select processor "<processor>"
    And Select RAM "<ram>"
    And Select HDD "<hdd>"
    And Select OS "<os>"
    And Select Software "software"
    And I click on ADD TO CART Button
    And I should see The message "The product has been added to your shopping cart"
    Examples:
      | processor                                       | ram           | hdd               | os                      | software                   |
      | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]    | Microsoft Office [+$50.00] |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | Vista Home [+$50.00]    | Total Commander [+$5.00]   |

