@CheckBox
Feature: CheckBox

  Scenario Outline: As a user I want to tick Option 1 checkbox
    Given that the user is on Check Box Demo page
    When the user checks Option <int>
    Then Option <int> checkbox is ticked
    Examples:
      | int |
      | 1   |
      | 2   |
      | 3   |
      | 4   |

  Scenario Outline: As a user I want to un-tick Option 1 checkbox
    Given that the user is on Check Box Demo page
    When the user unchecks Option <int>
    Then Option <int> checkbox is not ticked
    Examples:
      | int |
      | 1   |
      | 2   |
      | 3   |
      | 4   |

#  Scenario : As a user I want to be able to tick all checkboxes at once
#    Given that the user is on Check Box Demo page
#    When the user clicks on Check All button
#    Then all check boxes are selected
