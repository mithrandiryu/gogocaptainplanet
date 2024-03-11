package com.tremend.practice.steps;

import com.tremend.practice.tpages.SingleCheckBoxPage;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class SingleCheckBoxSteps {

    private SingleCheckBoxPage singleCheckBoxPage;

    @Step
    public void user_navigates_to_check_box_page() {
        singleCheckBoxPage.navigateToCheckBoxPage();
    }


    @Step
    public void user_click_first_check_box() {
        singleCheckBoxPage.clickFirstCheckBox();
    }

    @Step
    public void check_box_is_checked(boolean value) {
        assertThat(singleCheckBoxPage.checkBoxChecked()).as("Success- Check box is checked").isEqualTo(value);
    }

    @Step
    public void user_click_second_check_box() {
        singleCheckBoxPage.clickDefaultChecked();
    }

    @Step
    public void check_default_checked(boolean value) {
        assertThat(singleCheckBoxPage.checkDefaultBox()).as("Success- Check box is checked").isEqualTo(value);
    }
}
