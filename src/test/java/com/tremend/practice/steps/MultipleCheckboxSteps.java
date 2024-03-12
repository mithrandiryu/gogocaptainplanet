package com.tremend.practice.steps;

import com.tremend.practice.tpages.MultipleCheckboxPage;
import net.thucydides.core.annotations.Step;


public class MultipleCheckboxSteps {


    private MultipleCheckboxPage multipleCheckboxPage;

    @Step
    public void user_navigates_to_check_box_page() {
        multipleCheckboxPage.navigateToCheckBoxPage();
    }

    @Step
    public void user_click_check_all_button() {
        multipleCheckboxPage.checkAllButton();
    }

    @Step
    public void user_checks_if_options_are_checked() {
        multipleCheckboxPage.allOptionsChecked();
    }
}