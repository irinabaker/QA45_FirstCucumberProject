Feature: Home Page

  @navigate
  Scenario: Home Page title is displayed
    Given User launches Chrome Browser
    When User opens ilcarro Home Page
    Then User verifies Home Page title is displayed
    And User closes browser