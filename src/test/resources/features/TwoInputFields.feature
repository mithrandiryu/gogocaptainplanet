Feature: Two Input Fields into Simple form

   @simpleForm
  Scenario Outline: As a user I want to be able to display the sum of two values
    Given that the user is on Simple form page
    When  the user inputs both values, triggering the system to calculate the total
    Then  the calculated sum of the values is showcased
     Examples:
       | valueA | valueB | valueSum |
       | 4      | 1      | 5        |


  @simpleForm
  Scenario Outline: As a user I want to be able to display the sum of two negative values
    Given that the user is on Simple form page
    When  the user inputs both values as negative, triggering the system to calculate the total
    Then  the calculated sum of the negative values is showcased

    Examples:
      | valueA | valueB | valueSum |
      | -3     | -5     | -8       |


