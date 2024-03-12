Feature: Multiple Checkbox Demo


  @Options @Regression
    Scenario: As a user I want to select all options displayed
    Given the user is on the multiple Checkbox Demo page
    When  the user press check all button
    Then  the options are selected
    And   the button label is updated


