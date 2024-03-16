Feature: Multiple Checkbox Demo


    @Options @Regression
    Scenario: As a user I should be able to select all options displayed
    Given the user is on the multiple Checkbox Demo page
    When  the user press check all button
    Then  all the options are ticked
    And   the button label is updated


    @Options @Regression
    Scenario: As a user I should be able to unselect all options displayed
    Given the user is on the multiple Checkbox Demo page
    And   all options are selected
    When  the user press check unCheck all button
    Then  the options will be unticked
    And   the button label is updated

    @Options @Regression
    Scenario Outline: As a user I want to tick checkboxes
        Given the user is on the multiple Checkbox Demo page
        When  the user marks an option displayed <int>
        Then  all <int> checkboxes are marked

        Examples:
            |     int      |
            |      1       |
            |      2       |
            |      3       |
            |      4       |