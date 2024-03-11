package com.tremend.practice.keywords;
import com.tremend.practice.steps.TwoInputFieldsSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TwoInputFieldsKeywords {
    @Steps
    TwoInputFieldsSteps twoInputFieldsSteps;


    /**
     * ==== STEPS FOR GIVEN  ====
     */
    @Given("that the user is on Simple form page")
    public void thatTheUserIsOnSimpleFormPage() {
        twoInputFieldsSteps.user_navigates_to_simple_form_page();
    }


    /**
     * ==== STEPS FOR WHEN  ====
     */

    @When("the user inputs both values {string} and {string}")
    public void theUserInputsBothValuesValueAAndValueBTriggeringTheSystemToCalculateTheTotal(String valueA, String valueB) {
        twoInputFieldsSteps.user_insert_keys_into_input_field_a(valueA);
        twoInputFieldsSteps.user_insert_keys_into_input_field_b(valueB);
    }

    @And("the user press the Get Total button")
    public void getTotalButton() {
        twoInputFieldsSteps.user_click_get_total_button();
    }

    @When("the user inputs both negative values")
    public void theUserInputsBothNegativeValues() {
        twoInputFieldsSteps.user_insert_keys_into_input_field_a("-3");
        twoInputFieldsSteps.user_insert_keys_into_input_field_b("-5");
    }

    @When("the user inputs positive numbers")
    public void theUserInputsPositiveNumbers() {
        twoInputFieldsSteps.user_insert_keys_into_input_field_a("4");
        twoInputFieldsSteps.user_insert_keys_into_input_field_b("1");
    }

    @When("the user send a value just in the first field")
    public void theUserSendAValueJustInTheFirstField() {
        twoInputFieldsSteps.user_insert_keys_into_input_field_a("8");
    }

    @When("the user send characters other than numbers in one of the fields")
    public void theUserSendCharactersOtherThanNumbersInOneOfTheFields() {
        twoInputFieldsSteps.user_insert_keys_into_input_field_a("+1");
        twoInputFieldsSteps.user_insert_keys_into_input_field_b("1");
    }


    /**
     * ==== STEPS FOR THEN  ====
     */
    @Then("the calculated {string} of the values is showcased")
    public void theCalculatedValueSumOfTheValuesIsShowcased(String value) {
        twoInputFieldsSteps.assert_that_get_total_show_value(value);
    }

    @Then("the calculation sum of the values is showcased")
    public void theCalculationSumOfTheValuesIsShowCased() {
        twoInputFieldsSteps.assert_that_get_total_show_value(4,1);
    }

    @Then("the calculation of the negative values is showcased")
    public void theCalculationOfTheNegativeValuesIsShowcased() {
        twoInputFieldsSteps.assert_that_get_total_show_value(-3,-5);
    }


    @Then("the result will be NaN")
    public void theResultWillBeNaN() {
        twoInputFieldsSteps.assert_that_get_total_show_value("NaN");
    }


    @Then("the result of the values is displayed")
    public void theResultOfTheValuesIsDisplayed() {
        twoInputFieldsSteps.assert_that_get_total_show_value(+1, 1);
    }


        }



