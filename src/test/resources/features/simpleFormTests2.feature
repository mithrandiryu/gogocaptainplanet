Feature: Simple Form

  @simpleForm @regression @smoke @sanity
  Scenario: As a user I want the output of the displayed label to be blank if I don't input any text
    Given that the user is on SimpleForm page
    When the user clicks the show message button with an empty file
    Then the displayed label is blank