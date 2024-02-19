package com.tremend.practice.keywords;

import com.tremend.practice.steps.SimpleFormSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SimpleFormKeywords {


    @Steps
    private SimpleFormSteps simpleFormSteps;


    /** ===== STEPS FOR GIVEN ===== */

    @Given("that the user is on SimpleForm page")
    public void thatTheUserIsOnSimpleFormPage() {
        simpleFormSteps.user_navigates_to_simple_form_page();
    }


    /** ===== STEPS FOR WHEN ===== */

    @When("the user clicks the show message button with an empty file")
    public void theUserClicksTheShowMessageButtonWithAnEmptyFile() {
        simpleFormSteps.user_clears_the_simple_form_input_field();
        simpleFormSteps.user_click_the_submit_button();

    }

    @When("The user clicks the Show Message button after entering the expected message.")
    public void theUserClicksTheShowMessageButtonAfterEnteringTheExpectedMessage() {
        simpleFormSteps.user_insert_keys_into_input_field("Positive Scenario");
        simpleFormSteps.user_click_the_submit_button();
    }

    /** ===== STEPS FOR THEN ===== */

    @Then("the displayed label is blank")
    public void theDisplayedLabelIsBlank() {
        simpleFormSteps.assert_that_element_is_displayed_value_is(false);
    }



    @Then("The displayed label should match the entered message.")
    public void theDisplayedLabelShouldMatchTheEnteredMessage() {
        simpleFormSteps.assert_that_the_field_has_this_value("Positive Scenario");
    }
}