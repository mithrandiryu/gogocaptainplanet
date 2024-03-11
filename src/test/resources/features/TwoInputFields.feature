Feature: Two Input Fields into Simple form

    @TwoInputFields @Regression
   Scenario: As a user I want to be able to display the sum of two positive values
     Given  that the user is on Simple form page
      When  the user inputs positive numbers
      And   the user press the Get Total button
      Then  the calculation sum of the values is showcased



   @TwoInputFields @Regression
   Scenario: As a user I want to get the sum of two negative values
     Given that the user is on Simple form page
     When  the user inputs both negative values
     And   the user press the Get Total button
     Then  the calculation of the negative values is showcased



  @TwoInputFields @Regression
  Scenario: As a user I expect to see a NaN result when I input a single value
    Given that the user is on Simple form page
    When  the user send a value just in the first field
    And   the user press the Get Total button
    Then  the result will be NaN



  @TwoInputFields @regression
  Scenario: As a user I want to validate that uses characters other than numbers
   Given that the user is on Simple form page
   When  the user send characters other than numbers in one of the fields
    And   the user press the Get Total button
   Then  the result of the values is displayed



  Scenario Outline: As a user I want to get the sum of two values
    Given that the user is on Simple form page
    When  the user inputs both values "<valueA>" and "<valueB>"
    And   the user press the Get Total button
    Then  the calculated "<valueSum>" of the values is showcased

  Examples:
    | valueA | valueB | valueSum |
    |    4   |    1   |     5    |
    |   +1   |    1   |     2    |
    |   -3   |   -5   |    -8    |
    |    8   |        |    NaN   |
    |        |        |    NaN   |
    |    a   |    0   |    NaN   |
    |   -10  |    b   |    NaN   |
