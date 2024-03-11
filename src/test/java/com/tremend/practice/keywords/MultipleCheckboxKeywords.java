package com.tremend.practice.keywords;

import com.tremend.practice.steps.MultipleCheckBoxSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.WebElementFacade;
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
        multipleCheckBoxSteps.user_ticks_unticks_all_checkboxes_using_btn();
        multipleCheckBoxSteps.user_unticks_a_checkbox(arg0 - 1);
    }
    @When("the user clicks on Check All button")
    @And("all check boxes are ticked")
    public void theUserClicksOnCheckAllButton() {
        multipleCheckBoxSteps.user_ticks_unticks_all_checkboxes_using_btn();
    }

    // ==== THEN STEPS ===
    //one way of doing the decrement(not sure which one is better)
    @Then("Option {int} checkbox is ticked")
    public void optionIntCheckboxIsTicked(int arg0) {
        arg0--;
        multipleCheckBoxSteps.assert_that_the_checkbox_is_selected(arg0);
    }
    //another way of doing the decrement (not sure which one is better)
    @Then("Option {int} checkbox is not ticked")
    public void optionIntCheckboxIsNotTicked(int arg0) {
        multipleCheckBoxSteps.assert_that_the_checkbox_is_unselected(arg0 -1);
    }

    @Then("all check boxes are selected")
    public void allCheckBoxesAreSelected() {
        multipleCheckBoxSteps.assert_that_all_checkbox_are_ticked();
    }

    @When("the user clicks on Uncheck All button")
    public void theUserClicksOnUncheckAllButton() {
        multipleCheckBoxSteps.user_ticks_unticks_all_checkboxes_using_btn();
    }

    @Then("all check boxes are de-selected")
    public void allCheckBoxesAreDeSelected() {
        multipleCheckBoxSteps.assert_that_all_checkbox_are_unticked();

    }
    @And("the button label is {string}")
    public void theButtonLabelIs(String arg0) {
        multipleCheckBoxSteps.assert_that_button_label(arg0);
    }
}
