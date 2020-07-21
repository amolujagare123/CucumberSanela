# new feature
# Tags: optional

Feature: all login test

  @login
  Scenario: to test the functionality of login button for valid input
    Given I am on login page
    When  I enter "sanela" and "sanela-password"
    And I click on login button
    Then I should be on home page
  @login
  Scenario: to test the functionality of login button for invalid input
    Given I am on login page
    When  I enter "amol" and "amol-password"
    And I click on login button
    Then I should be on home page

