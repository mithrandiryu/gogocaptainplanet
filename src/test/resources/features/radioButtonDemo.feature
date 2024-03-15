@RadioButtons @regression
  Feature: Radio

    @RadioButtons @regression @sanity
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

    @RadioButtons @edge
      Scenario Outline: As I user I want to be unable to de-select gender radio buttons
        Given the user is on Radio Buttons page
        When the user clicks the gender "<radiobutton>" button twice with the intention of de-selecting it
        Then the selected gender button is "<stillSelected>"
          Examples:
          | radiobutton | stillSelected |
          | Male        | Male          |
          | Female      | Female        |

    @RadioButtons @edge
      Scenario Outline: As I user I want to be unable to de-select age group radio buttons
        Given the user is on Radio Buttons page
        When the user clicks the age group "<radiobutton>" button twice with the intention of de-selecting it
        Then the selected age group button is "<stillSelected>"
          Examples:
            | radiobutton | stillSelected |
            | 0 - 5       | 0 - 5         |
            | 5 - 15      | 5 - 15        |
            | 15 - 50     | 15 - 50       |

    @RadioButtons @edge
      Scenario Outline: As I user I want previous selected button to be un-ticked upon clicking a different button from the same group
        Given the user is on Radio Buttons page having the gender "<button>" already selected
        When the user selects the other gender "<option>" using its button
        Then the previously selected gender "<initialOptionUnSelected>" is un-ticked
          Examples:
            | button | option | initialOptionUnSelected |
            | Male   | Female | Male                    |
            | Female | Male   | Female                  |

    @RadioButtons @edge
      Scenario Outline: As I user I want previous selected button to be un-ticked upon clicking a different button from the same group
        Given the user is on Radio Buttons page having the age group "<button>" already selected
        When the user selects the other age group "<option>" using its button
        Then the previously selected age group "<initialOptionUnSelected>" is un-ticked
          Examples:
            | button | option   | initialOptionUnSelected |
            | 0 - 5  | 5 - 15   | 0 - 5                   |
            | 5 - 15 | 15 - 50  | 5 - 15                  |
            | 15 - 50| 5 - 15   | 15 - 50                 |