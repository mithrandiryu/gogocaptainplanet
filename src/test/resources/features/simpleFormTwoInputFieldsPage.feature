Feature: Simple form sum of two input fields

  Scenario: As a user I want to display the sum of two values
    Given that the user navigates to SimpleForm page
    When the user submits both values and gets the total result
    Then the sum of the values is displayed