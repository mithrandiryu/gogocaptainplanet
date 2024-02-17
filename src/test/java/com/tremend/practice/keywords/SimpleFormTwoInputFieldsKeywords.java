package com.tremend.practice.keywords;

import com.tremend.practice.steps.SimpleFormSteps;
import com.tremend.practice.steps.SimpleFormTwoInputFieldsSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class SimpleFormTwoInputFieldsKeywords {

    @Steps
    SimpleFormTwoInputFieldsSteps simpleFormTwoInputFieldsSteps;

    @Given("that the user navigates to SimpleForm page")
    public void thatTheUserNavigatesToSimpleFormPage() {
        simpleFormTwoInputFieldsSteps.user_navigates_to_simple_form_page();
    }

    @When("the user submits both values and gets the total result")
    public void theUserSubmitsBothValuesAndGetsTheTotalResult() {
        simpleFormTwoInputFieldsSteps.user_inputs_keys_into_input_field_a("2");
        simpleFormTwoInputFieldsSteps.user_inputs_keys_into_input_field_b("3");
        simpleFormTwoInputFieldsSteps.user_clicks_get_total_btn();

    }

    @Then("the sum of the values is displayed")
    public void theSumOfTheValuesIsDisplayed() {
        simpleFormTwoInputFieldsSteps.assert_that_get_total_provides_sum(2, 3);
    }


}
