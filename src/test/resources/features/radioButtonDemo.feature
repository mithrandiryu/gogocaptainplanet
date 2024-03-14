@RadioButtons @regression
  Feature: Radio

    @RadioButtons @regression
    Scenario Outline: As a user I want to get Age group and gender
      Given the user is on Radio Buttons page
      When the user selects the "<gender>" and "<ageGroup>" gender radio button
      And clicks Get Values button
      Then the "<resultLabel>" is displayed accordingly
      Examples:
        | gender | ageGroup | resultLabel  |
        | Male     | 0 - 5      | Sex : Male\nAge group: 0 - 5    |
        | Male     | 5 - 15     | Sex : Male\nAge group: 5 - 15   |
        | Male     | 15 - 50    | Sex : Male\nAge group: 15 - 50  |
        | Female   | 0 - 5      | Sex : Female\nAge group: 0 - 5  |
        | Female   | 5 - 15     | Sex : Female\nAge group: 5 - 15 |
        | Female   | 15 - 50    | Sex : Female\nAge group: 15 - 50|
        | Female   |            | Sex : Female\nAge group:        |
        | Male     |            | Sex : Male\nAge group:          |
        |          | 0 - 5      | Sex :\nAge group: 0 - 5         |
        |          | 5 - 15     | Sex :\nAge group: 5 - 15        |
        |          | 15 - 50    | Sex :\nAge group: 15 - 50       |

#  TBD
#      Scenario: As I user I want to be unable to de-select a radio button
