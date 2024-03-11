package com.tremend.practice.keywords;

import com.tremend.practice.steps.MultipleCheckBoxSteps;
import com.tremend.practice.steps.SimpleFormSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class MultipleCheckboxKeywords {
    @Steps
    private MultipleCheckBoxSteps multipleCheckBoxSteps;

    @Given("that the user is on Check Box Demo page")
    public void thatTheUserIsOnCheckBoxDemoPage() {
        multipleCheckBoxSteps.user_navigates_to_multiple_checkbox_page();
    }

    // ==== WHEN STEPS ===
    @When("the user checks Option {int}")
    public void theUserChecksOption(int arg0) {
        multipleCheckBoxSteps.user_ticks_a_checkbox(arg0 -1);
    }

    @When("the user unchecks Option {int}")
    public void theUserUnchecksOptionInt(int arg0) {
        multipleCheckBoxSteps.user_ticks_all_checkboxes_using_btn();
        multipleCheckBoxSteps.user_unticks_a_checkbox(arg0 - 1);
    }

    // ==== THEN STEPS ===
    @Then("Option {int} checkbox is ticked")
    public void optionIntCheckboxIsTicked(int arg0) {
        multipleCheckBoxSteps.assert_that_the_checkbox_is_selected(arg0 - 1);
    }

    @Then("Option {int} checkbox is not ticked")
    public void optionIntCheckboxIsNotTicked(int arg0) {
        multipleCheckBoxSteps.assert_that_the_checkbox_is_unselected(arg0 -1 );
    }

    @When("the user clicks on Check All button")
    public void theUserClicksOnCheckAllButton() {
    }

    @Then("all check boxes are selected")
    public void allCheckBoxesAreSelected() {
    }
}
