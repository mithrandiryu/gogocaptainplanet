package com.tremend.practice.keywords;

import com.tremend.practice.steps.RadioButtonSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;

public class RadioButtonKeywords {
    @Steps
    private RadioButtonSteps radioButtonSteps;

    /* ============================== GIVEN STEPS ============================== */
    @Given("the user is on Radio Buttons page")
    public void theUserIsOnRadioButtonsPage() {
        radioButtonSteps.user_navigates_to_radio_button_page();
    }
    @Given("the user is on Radio Buttons page having the gender {string} already selected")
    public void theUserIsOnRadioButtonsPageHavingTheGenderAlreadySelected(String arg0) {
        radioButtonSteps.user_navigates_to_radio_button_page();
        radioButtonSteps.user_ticks_gender_radio_button(arg0);
    }
    @Given("the user is on Radio Buttons page having the age group {string} already selected")
    public void theUserIsOnRadioButtonsPageHavingTheAgeGroupAlreadySelected(String arg0) {
        radioButtonSteps.user_navigates_to_radio_button_page();
        radioButtonSteps.user_ticks_age_group_radio_button(arg0);
    }

    /* ============================== WHEN STEPS ============================== */
    @When("the user selects the {string} and {string} gender radio button")
    public void theUserSelectsTheAndGenderRadioButton(String arg0, String arg1) {
        radioButtonSteps.user_ticks_gender_radio_button(arg0);
        radioButtonSteps.user_ticks_age_group_radio_button(arg1);
        radioButtonSteps.assert_that_gender_button_is_ticked(arg0);
        radioButtonSteps.assert_that_age_group_button_is_ticked(arg1);
    }
    @When("the user selects the {string} gender button")
    public void theUserSelectsTheGenderButton(String arg0) {
        radioButtonSteps.user_ticks_gender_radio_button(arg0);
    }

    @When("the user clicks the gender {string} button twice with the intention of de-selecting it")
    public void theUserClicksTheButtonTwiceWithTheIntentionOfDeSelectingIt(String arg0) {
        radioButtonSteps.user_ticks_gender_radio_button(arg0);
        radioButtonSteps.user_ticks_gender_radio_button(arg0);
    }
    @When("the user clicks the age group {string} button twice with the intention of de-selecting it")
    public void theUserClicksTheAgeGroupButtonTwiceWithTheIntentionOfDeSelectingIt(String arg0) {
        radioButtonSteps.user_ticks_age_group_radio_button(arg0);
        radioButtonSteps.user_ticks_age_group_radio_button(arg0);
    }
    @When("the user selects the other age group {string} using its button")
    public void theUserSelectsTheOtherAgeGroupUsingItsButton(String arg0) {
        radioButtonSteps.user_ticks_age_group_radio_button(arg0);
    }
    @When("the user selects the other gender {string} using its button")
    public void theUserSelectsTheOtherGenderUsingItsButton(String arg0) {
        radioButtonSteps.user_ticks_gender_radio_button(arg0);
    }
    /* ============================== THEN STEPS ============================== */
    @Then("the {string} is displayed accordingly")
    public void theIsDisplayedAccordingly(String arg0) {
        radioButtonSteps.assert_that_result_label(arg0);
    }
    @Then("the selected gender button is {string}")
    public void theButtonIsStillSelected(String arg0) {
        radioButtonSteps.assert_that_gender_button_is_ticked(arg0);
    }
    @Then("the selected age group button is {string}")
    public void theSelectedAgeGroupButtonIs(String arg0) {
        radioButtonSteps.assert_that_age_group_button_is_ticked(arg0);
    }
    @Then("the previously selected gender {string} is un-ticked")
    public void thePreviouslySelectedGenderIsUnTicked(String arg0) {
        radioButtonSteps.assert_that_gender_button_is_unticked(arg0);
    }
    @Then("the previously selected age group {string} is un-ticked")
    public void thePreviouslySelectedAgeGroupIsUnTicked(String arg0) {
        radioButtonSteps.assert_that_age_group_button_is_unticked(arg0);
    }
    /* ============================== AND STEPS ============================== */
    @And("clicks Get Values button")
    public void clicksGetValuesButton() {
        radioButtonSteps.user_clicks_on_get_values_btn();
    }
}
