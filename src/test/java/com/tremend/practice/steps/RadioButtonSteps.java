package com.tremend.practice.steps;

import com.tremend.practice.tpages.RadioButtonPage;
import net.thucydides.core.annotations.Step;
import org.jetbrains.annotations.NotNull;

import static org.assertj.core.api.Assertions.assertThat;

public class RadioButtonSteps {

    private RadioButtonPage radioButtonPage;

    @Step
    public void user_navigates_to_radio_button_page(){
        radioButtonPage.navigateToCheckBoxDemoPage();
    }
    @Step
    public void user_ticks_gender_radio_button(String value){
        radioButtonPage.userTicksGenderRadioButtonBasedOnAttribute(value);
    }
    @Step
    public void user_ticks_age_group_radio_button(String value){
        radioButtonPage.userTicksAgeGroupRadioButtonBasedOnAttribute(value);
    }
    @Step
    public void user_clicks_on_get_values_btn(){
        radioButtonPage.clickGetValuesBtn();
    }
    @Step
    public void assert_that_gender_button_is_ticked(@NotNull String value){
        if (!value.isEmpty()){
            assertThat(radioButtonPage.isGenderRadioButtonChecked(value)).as("Radio button is checked").isTrue();
        }else
            assertThat(radioButtonPage.isGenderRadioButtonChecked(value)).as("Radio button is checked").isFalse();
    }
    @Step
    public void assert_that_age_group_button_is_ticked(@NotNull String value){
        if (!value.isEmpty()){
            assertThat(radioButtonPage.isAgeGroupRadioButtonChecked(value)).as("Radio button is checked").isTrue();
        }
        else
            assertThat(radioButtonPage.isAgeGroupRadioButtonChecked(value)).as("Radio button is checked").isFalse();
    }
    @Step
    public void assert_that_result_label(String value){
        assertThat(radioButtonPage.getResultLabel()).as("Result label is").isEqualTo(value);
    }
}
