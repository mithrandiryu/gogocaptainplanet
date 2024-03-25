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
    public void user_clicks_get_values_button() {
        radioButtonsPage.clickRetrieveDataButton();
    }

    @Step
    public void verify_retrieved_outcome(String outcomeValue) {
        assertThat(radioButtonsPage.getOutcomeText()).isEqualTo(outcomeValue);
    }
}


