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

    }

    @And("The user clicks on the Get Values button")
    public void theUserClicksOnTheGetValuesButton() {
    }

    @Then("The system retrieves  {string}")
    public void theSystemRetrieves(String arg0, String arg1) {
    }
}
