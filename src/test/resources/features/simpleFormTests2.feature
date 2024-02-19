Feature: Simple Form

  @simpleForm @regression @smoke @sanity
  Scenario: As a user I want the output of the displayed label to be blank if I don't input any text
    Given that the user is on SimpleForm page
    When the user clicks the show message button with an empty file
    Then the displayed label is blank


  @simpleForm @regression @smoke @sanity
   Scenario: As a user I want the output of the displayed label to match the input field
   Given that the user is on SimpleForm page
   When The user clicks the Show Message button after entering the expected message.
   Then The displayed label should match the entered message.

