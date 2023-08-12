Feature: Techfios billing login page functionality validation
  
  Background :
  Given User is on the techfios login page
  When User enters username as "demo@techfios.com"

  Scenario: user should be able to login with vaild credentials
    When User enters password as "abc123"
    When User clicks on sign in button
    Then User should land on dashboard page

 