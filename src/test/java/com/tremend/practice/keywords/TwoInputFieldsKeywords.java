package com.tremend.practice.keywords;
import com.tremend.practice.steps.TwoInputFieldsSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TwoInputFieldsKeywords {
    @Steps
      TwoInputFieldsSteps twoInputFieldsSteps;



    /** ==== STEPS FOR GIVEN  ==== */
    @Given("that the user is on Simple form page")
    public void thatTheUserIsOnSimpleFormPage() {
        twoInputFieldsSteps.user_navigates_to_simple_form_page();
    }


    /** ==== STEPS FOR WHEN  ==== */
    @When("the user inputs both values, triggering the system to calculate the total")
    public void theUserInputsBothValuesTriggeringTheSystemToCalculateTheTotal() {
        twoInputFieldsSteps.user_insert_keys_into_input_field_a("4");
        twoInputFieldsSteps.user_insert_keys_into_input_field_b("1");
        twoInputFieldsSteps.user_click_get_total_button();
    }

    @When("the user inputs both values as negative, triggering the system to calculate the total")
    public void theUserInputsBothValuesAsNegativeTriggeringTheSystemToCalculateTheTotal() {
        twoInputFieldsSteps.user_insert_keys_into_input_field_a("-3");
        twoInputFieldsSteps.user_insert_keys_into_input_field_b("-5");
        twoInputFieldsSteps.user_click_get_total_button();
    }

    /** ==== STEPS FOR THEN  ==== */
    @Then("the calculated sum of the values is showcased")
    public void theCalculatedSumOfTheValuesIsShowcased() {
        twoInputFieldsSteps.assert_that_get_total_show_value(4, 1);
    }



    @Then("the calculated sum of the negative values is showcased")
    public void theCalculatedSumOfTheNegativeValuesIsShowcased() {
        twoInputFieldsSteps.assert_that_get_total_show_value(-3, -5);
    }
}

