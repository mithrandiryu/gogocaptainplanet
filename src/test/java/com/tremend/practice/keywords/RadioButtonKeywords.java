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

    @Given("the user is on Radio Buttons page")
    public void theUserIsOnRadioButtonsPage() {
        radioButtonSteps.user_navigates_to_radio_button_page();
    }

    @When("the user selects the {string} and {string} gender radio button")
    public void theUserSelectsTheAndGenderRadioButton(String arg0, String arg1) {
        radioButtonSteps.user_ticks_gender_radio_button(arg0);
        radioButtonSteps.user_ticks_age_group_radio_button(arg1);
        radioButtonSteps.assert_that_gender_button_is_ticked(arg0);
        radioButtonSteps.assert_that_age_group_button_is_ticked(arg1);
    }
    @Then("the {string} is displayed accordingly")
    public void theIsDisplayedAccordingly(String arg0) {
        radioButtonSteps.assert_that_result_label(arg0);
    }

    @And("clicks Get Values button")
    public void clicksGetValuesButton() {
        radioButtonSteps.user_clicks_on_get_values_btn();
    }

    @When("the user selects the {string} gender button")
    public void theUserSelectsTheGenderButton(String arg0) {
        radioButtonSteps.user_ticks_gender_radio_button(arg0);
    }
}
