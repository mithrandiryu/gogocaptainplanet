Feature: Radio Buttons

  @RadioButtons @Regression
  Scenario Outline: As a user, I should be able to retrieve selected gender and age group

    Given The user is on the Radio Buttons page
    When  The user selects "<sex>" and "<ageGroup>"
    And   The user clicks on the Get Values button
    Then  The system retrieves  "<sexValue>" and "<ageGroupValue>"

    Examples:
      | sex    | ageGroup | sexValue     | ageGroupValue      |
      | Male   | 0 - 5    | Sex : Male   | Age group: 0 - 5   |
      | Male   | 5 - 15   | Sex : Male   | Age group: 5 - 15  |
      | Male   | 15 - 50  | Sex : Male   | Age group: 15 - 50 |
      | Female | 0 - 5    | Sex : Female | Age group: 0 - 5   |
      | Female | 5 - 15   | Sex : Female | Age group: 5 - 15  |
      | Female | 15 - 50  | Sex : Female | Age group: 15 - 50  |




