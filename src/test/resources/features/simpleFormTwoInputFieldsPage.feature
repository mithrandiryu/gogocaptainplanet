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