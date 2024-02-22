Feature: Two Input Fields into Simple form

   @TwoInputFields @regression @sanity @smoke
  Scenario Outline: As a user I want to be able to display the sum of two values
    Given that the user is on Simple form page
    When  the user inputs both values, triggering the system to calculate the total
    Then  the calculated sum of the values is showcased
     Examples:
       | valueA | valueB | valueSum |
       | 4      | 1      | 5        |


  @TwoInputFields @regression @sanity @smoke
  Scenario Outline: As a user I want to be able to display the sum of two negative values
    Given that the user is on Simple form page
    When  the user inputs both values as negative, triggering the system to calculate the total
    Then  the calculated sum of the negative values is showcased

    Examples:
      | valueA | valueB | valueSum |
      | -3      | -5     | -8      |


  @TwoInputFields @regression @sanity @smoke
  Scenario Outline: As a user I want to be able to display a non-numeric result when one value is displayed
    Given that the user is on Simple form page
    When  the user send a value just in one field
    Then  the result displayed will be Nan(notAnumber)

    Examples:
      | valueA | valueB | valueSum |
      | 8      |        | non   |