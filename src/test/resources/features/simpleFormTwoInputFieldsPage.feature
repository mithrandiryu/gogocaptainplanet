Feature: Simple form sum of two input fields

  Scenario: As a user I want to display the sum of two values
    Given that the user navigates to SimpleForm page
    When the user submits both values and gets the total result
    Then the sum of the values is displayed

  Scenario: As a user I want the output of the displayed result to be NaN when whe only one value is provided
    Given that the user navigates to SimpleForm page
    When the user submits only one of the values
    Then the output displayed is NaN

  Scenario: As a user I want the output of the displayed result to be NaN when no values are provided
    Given that the user navigates to SimpleForm page
    When the user submits no values
    Then the output displayed is NaN

  Scenario: As a user I want to display the sum of two negative values
    Given that the user navigates to SimpleForm page
    When the user submits both values as negative and gets the total result
    Then the sum of the negative values is displayed

  Scenario: As a user I want the output of the displayed result to be NaN when an invalid value is provided
    Given that the user navigates to SimpleForm page
    When the user submits an invalid value in one of the fields
    Then the output displayed is NaN


  Scenario Outline: As a user I want to get the sum of two values
    Given that the user navigates to SimpleForm page
    When the user submits "<value1>" and "<value2>"
    Then the output "<valueTotal>" is displayed
    Examples:
      | value1    |  value2   | valueTotal|
      | 2         | 3         | 5         |
      | 1         | 9         | 10        |
      |-1         |-2         |-3         |
      | a         | b         | NaN       |
      | a         | 2         | NaN       |
      |           |           | NaN       |
      |1          |           | NaN       |
      |1.2        |2.5        | 3         |
