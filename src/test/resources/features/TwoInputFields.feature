Feature: Two Input Fields into Simple form


  Scenario Outline: As a user I want to be able to display the sum of two values
    Given that the user is on Simple form page
    When  the user inputs both values, triggering the system to calculate the total
    Then  the calculated sum of the values is showcased

    Examples:
      | valueA | valueB | valueSum |
      | 4      | 1      | 5        |
      | 1      | 8      | 9       |
      | -3     | -5     | -8       |
      | a      | b      | NaN      |

