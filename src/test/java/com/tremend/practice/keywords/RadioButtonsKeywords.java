package com.tremend.practice.keywords;

import com.tremend.practice.steps.RadioButtonsSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RadioButtonsKeywords {

    @Steps
    RadioButtonsSteps radioButtonsSteps;


    /**====GIVEN====*/
    @Given("The user is on the Radio Buttons page")
    public void theUserIsOnTheRadioButtonsPage() {
        radioButtonsSteps.user_is_on_radio_button_page();


    }
    /**====WHEN====*/
    @When("The user selects {string} and {string}")
    public void theUserSelectsSexAndAgeGroup(String sex, String ageGroup) {
        radioButtonsSteps.user_clicks_sex_button(sex);
        radioButtonsSteps.user_clicks_age_group_button(ageGroup);
        // added in additional
        radioButtonsSteps.user_clicks_get_values_button();

    }

    @And("The user clicks on the Get Values button")
    public void theUserClicksOnTheGetValuesButton() {
        radioButtonsSteps.user_clicks_get_values_button();
    }


    @Then("The system retrieves  {string} and {string}")
    public void theSystemRetrievesAnd(String sexValue, String ageGroupValue){
        radioButtonsSteps.verify_retrieved_outcome(sexValue, ageGroupValue);
    }
}
