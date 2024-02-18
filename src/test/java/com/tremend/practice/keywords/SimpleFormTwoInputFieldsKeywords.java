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

    // ============== GIVEN STEPS ==============

    @Given("that the user navigates to SimpleForm page")
    public void thatTheUserNavigatesToSimpleFormPage() {
        simpleFormTwoInputFieldsSteps.user_navigates_to_simple_form_page();
    }

    // ============== WHEN STEPS ==============

    @When("the user submits both values and gets the total result")
    public void theUserSubmitsBothValuesAndGetsTheTotalResult() {
        simpleFormTwoInputFieldsSteps.user_inputs_keys_into_input_field_a("2");
        simpleFormTwoInputFieldsSteps.user_inputs_keys_into_input_field_b("3");
        simpleFormTwoInputFieldsSteps.user_clicks_get_total_btn();
    }

    @When("the user submits only one of the values")
    public void theUserSubmitsOnlyOneOfTheValues() {
        simpleFormTwoInputFieldsSteps.user_inputs_keys_into_input_field_a("2");
        simpleFormTwoInputFieldsSteps.user_clicks_get_total_btn();
    }

    @When("the user submits no values")
    public void theUserSubmitsNoValues() {
        simpleFormTwoInputFieldsSteps.user_clicks_get_total_btn();
    }

    @When("the user submits both values as negative and gets the total result")
    public void theUserSubmitsBothValuesAsNegativeAndGetsTheTotalResult() {
        simpleFormTwoInputFieldsSteps.user_inputs_keys_into_input_field_a("-2");
        simpleFormTwoInputFieldsSteps.user_inputs_keys_into_input_field_b("-3");
        simpleFormTwoInputFieldsSteps.user_clicks_get_total_btn();
    }

    @When("the user submits an invalid value in one of the fields")
    public void theUserSubmitsAnInvalidValueInOneOfTheFields() {
        simpleFormTwoInputFieldsSteps.user_inputs_keys_into_input_field_a("-2");
        simpleFormTwoInputFieldsSteps.user_inputs_keys_into_input_field_b("invalid string value");
        simpleFormTwoInputFieldsSteps.user_clicks_get_total_btn();

    }

    // ============== THEN STEPS ==============

    @Then("the sum of the values is displayed")
    public void theSumOfTheValuesIsDisplayed() {
        simpleFormTwoInputFieldsSteps.assert_that_get_total_show_value(2, 3);
    }

    @Then("the output displayed is NaN")
    public void theOutputDisplayedIsNaN() {
        simpleFormTwoInputFieldsSteps.assert_that_get_total_show_value(1);
    }

    @Then("the sum of the negative values is displayed")
    public void theSumOfTheNegativeValuesIsDisplayed() {
        simpleFormTwoInputFieldsSteps.assert_that_get_total_show_value(-2, -3);
    }

    @When("the user submits {string} and {string}")
    public void theUserSubmitsValues(String arg0, String arg1) {
        simpleFormTwoInputFieldsSteps.user_inputs_keys_into_input_field_a(arg0);
        simpleFormTwoInputFieldsSteps.user_inputs_keys_into_input_field_b(arg1);
        simpleFormTwoInputFieldsSteps.user_clicks_get_total_btn();
    }


    @Then("the output {string} is displayed")
    public void theOutputIsDisplayed(String arg0) {
        simpleFormTwoInputFieldsSteps.assert_get_total_value(arg0);
    }
}
