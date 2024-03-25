Feature: Radio Buttons

  @RadioButtons @Regression
  Scenario Outline: As a user, I should be able to retrieve selected gender and age group

  Given The user is on the Radio Buttons page
  When  The user selects "<sex>" and "<ageGroup>"
  And   The user clicks on the Get Values button
  Then  The system retrieves  "<outcomeValue>"

    Examples:
      | sex  | ageGroup | outcomeValue                |
      | Male | 0 - 5    | Sex: Male\nAge group: 0 - 5 |
      | Male | 5 - 15   | Sex:



