package com.tremend.practice.steps;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.tremend.practice.tpages.TwoInputFieldsPage;
import net.thucydides.core.annotations.Step;
import org.assertj.core.api.Assertions;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class TwoInputFieldsSteps {

    TwoInputFieldsPage twoInputFieldsPage;

    private String invalidInput = "NaN";

    @Step
    public void user_navigates_to_simple_form_page() {
        twoInputFieldsPage.navigateToSimpleFormPage();
    }

    @Step
    public void user_insert_keys_into_input_field_a(String value) {
        twoInputFieldsPage.setInputFieldA(value);
    }

    @Step
    public void user_insert_keys_into_input_field_b(String value) {
        twoInputFieldsPage.setInputFieldB(value);
    }

    @Step
    public void user_click_get_total_button() {
        twoInputFieldsPage.clickGetTotalBtn();
    }

    public void assert_that_get_total_show_value(Integer valueA, Integer valueB) {
            assertThat(twoInputFieldsPage.showGetTotalValueInteger() ).as("Get Total Sum displayed value is ").isEqualTo(valueA + valueB);
    }



}
