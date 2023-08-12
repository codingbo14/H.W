Feature: Techfios billing login page functionality validation
  
  Background  :
  Given  User is on the techfios login page

  Scenario: user should be able to login with vaild credentials and open a new account
    When User enters username as "demo2@techfios.com"
    When User enters password as "abc123"
    When User clicks on sign in button
    Then User should land on dashboard page
    And user clicks on "bankcash"
    And user clicks on "newAccount"
    And user enters "<accountTitle>"
    And user enters "<description>"
    And user enters "<initiaBalance>"
    And user enters "<accountNumber>"
    And user enters "<accountperson>"
    And user enters "<phone>"
    And user enters "<internetBankingURL>"
    And user clicks on "submit"
    Then user sholud be able to validate account created successfully

  Scenario: user should be able to login with vaild credentials
    When User enters username as "demo@techfios.com"
    When User enters password as "abc124"
    When User clicks on sign in button
    Then User should land on dashboard page

  Scenario: user should be able to login with vaild credentials
    When User enters username as "demo2@techfios.com"
    When User enters password as "abc123"
    When User clicks on sign in button
    Then User should land on dashboard page

  Scenario: user should be able to login with vaild credentials
    When User enters username as ""
    When User enters password as ""
    When User clicks on sign in button
    Then User should land on dashboard page
