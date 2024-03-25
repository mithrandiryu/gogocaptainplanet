package com.tremend.practice.steps;

import com.tremend.practice.tpages.RadioButtonsPage;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RadioButtonsSteps {

    private RadioButtonsPage radioButtonsPage;

    @Step
    public void user_is_on_radio_button_page() {
        radioButtonsPage.navigateToDemoPage();
    }

    @Step
    public void user_clicks_sex_button(String sex) {
        radioButtonsPage.userSelectsSex(sex);
    }

    @Step
    public void user_clicks_age_group_button(String ageGroup) {
        radioButtonsPage.userSelectsAgeGroup(ageGroup);
    }

    @Step
    public void user_checks_that_the_sex_button_is_selected(String sex) {
        assertThat(radioButtonsPage.isSexRadioButtonChecked(sex)).as("Radio button is checked").isTrue();

    }

    @Step
    public void user_checks_that_the_agr_group_is_selected(String ageGroup) {
        assertThat(radioButtonsPage.isAgeGroupButtonChecked(ageGroup)).as("Radio button is checked").isTrue();
    }



}