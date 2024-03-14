@CheckBox @regression
Feature: CheckBox

  @regression
  Scenario: As a user I want to be able to tick all checkboxes at once
    Given that the user is on Check Box Demo page
    When the user clicks on Check All button
    Then all check boxes are selected
    And the button label is "Uncheck All"

  @regression
  Scenario: As a user I want to be able to un-tick all checkboxes at once
    Given that the user is on Check Box Demo page
    And all check boxes are ticked
    When the user clicks on Uncheck All button
    Then all check boxes are de-selected
    And the button label is "Check All"

  @regression
  Scenario Outline: As a user I want to tick Option checkbox
    Given that the user is on Check Box Demo page
    When the user checks Option <int>
    Then Option <int> checkbox is ticked
    Examples: Selectable options
      | int |
      | 1   |
      | 2   |
      | 3   |
      | 4   |

  @regression
  Scenario Outline: As a user I want to un-tick Option checkbox
    Given that the user is on Check Box Demo page
    When the user unchecks Option <int>
    Then Option <int> checkbox is not ticked
    Examples: Selectable options
      | int |
      | 1   |
      | 2   |
      | 3   |
      | 4   |