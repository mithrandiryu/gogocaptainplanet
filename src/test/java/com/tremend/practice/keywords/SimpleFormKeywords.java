package com.tremend.practice.keywords;

import com.tremend.practice.steps.SimpleFormSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SimpleFormKeywords {

    @Steps
    private SimpleFormSteps simpleFormSteps;



    @Given("that the user is on SimpleForm page")
    public void thatTheUserIsOnSimpleFormPage() {
        simpleFormSteps.user_navigates_to_simple_form_page();
    }

    @When("the user clicks the show message button with an empty file")
    public void theUserClicksTheShowMessageButtonWithAnEmptyFile() {
        simpleFormSteps.user_clears_the_simple_form_input_field();
        simpleFormSteps.user_click_the_submit_button();

    }

    @Then("the displayed label is blank")
    public void theDisplayedLabelIsBlank() {
        simpleFormSteps.assert_that_element_is_displayed_value_is(false);
    }
}
