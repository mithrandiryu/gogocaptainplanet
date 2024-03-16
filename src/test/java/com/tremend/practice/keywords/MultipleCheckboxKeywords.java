package com.tremend.practice.keywords;

import com.tremend.practice.steps.MultipleCheckboxSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class MultipleCheckboxKeywords {

    @Steps
    MultipleCheckboxSteps multipleCheckboxSteps;


    /**
     * ====GIVEN====
     */

    @Given("the user is on the multiple Checkbox Demo page")
    public void checkBoxPage() {
        multipleCheckboxSteps.user_navigates_to_check_box_page();
    }

    @And("all options are selected")
    public void allOptionsAreSelected() {
        multipleCheckboxSteps.user_click_unCheck_all_button();
    }


    /**
     * ====WHEN====
     */

    @When("the user press check all button")
    public void checkAll() {
        multipleCheckboxSteps.user_click_check_all_button();
    }

    @When("the user press check unCheck all button")
    public void pressUncheckAll() {
        multipleCheckboxSteps.user_click_unCheck_all_button();
    }

    // Scenario Outline
    @When("the user marks an option displayed {int}")
    public void theUserTicksAllOptionCheckboxes(int arg0) {
        multipleCheckboxSteps.user_marks_an_option(1);
    }

    /**
     * ====THEN=====
     */
    @Then("all the options are ticked")
    public void user_checks_if_options_are_checked() {
        multipleCheckboxSteps.user_checks_if_options_are_checked();
    }

    @And("the button label is updated")
    public void theButtonLabelIsUpdated() {

    }


    @Then("the options will be unticked")
    public void theOptionsWillBeUnticked() {
        multipleCheckboxSteps.user_checks_if_options_are_unChecked();
    }


    @Then("all {int} checkboxes are marked")
    public void allCheckboxesAreMarked(int arg0) {


    }
}





