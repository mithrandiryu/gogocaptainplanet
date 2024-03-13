Feature: Single CheckBox Demo

  @CheckBox @Regression
  Scenario: As a user I should be able to tick the first check box
    Given the user is on the Checkbox Demo page
    When  the user press on the first checkbox
    Then  the checkbox is checked
    And   a success message is displayed


  @CheckBox @Regression
  Scenario: As a user I should be able to deselect the second check box
    Given the user is on the Checkbox Demo page
    When  the user press on the second checkbox
    Then  the checkbox is unchecked
    And   the success message is not displayed
