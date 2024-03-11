package com.tremend.practice.keywords;

import com.tremend.practice.steps.SingleCheckBoxSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SingleCheckBoxKeywords {


    @Steps
    SingleCheckBoxSteps singleCheckBoxSteps;


    /**====GIVEN====*/

    @Given("the user is on the Checkbox Demo page")
    public void demoPage() {
        singleCheckBoxSteps.user_navigates_to_check_box_page();
    }

    /**====WHEN====*/

    @When("the user press on the first checkbox")
    public void pressFirstCheckBox() {
        singleCheckBoxSteps.user_click_first_check_box();
    }

    @When("the user press on the second checkbox")
    public void pressSecondCheckBox() {
       singleCheckBoxSteps.user_click_second_check_box();
    }


    /**====THEN====*/
    @Then("the checkbox is checked")
    public void isChecked() {
        boolean value = true;
        singleCheckBoxSteps.check_box_is_checked(value);
    }

    @And("a success message is displayed")
    public void messageIsDisplayed() {
        singleCheckBoxSteps.check_box_is_checked(true);
    }


    @Then("the checkbox is unchecked")
    public void isUnchecked() {
        boolean value = false;
        singleCheckBoxSteps.check_default_checked(value);
    }

    @And("the success message is not displayed")
    public void theSuccessMessageIsNotDisplayed() {
        singleCheckBoxSteps.check_default_checked(false);
    }
}
