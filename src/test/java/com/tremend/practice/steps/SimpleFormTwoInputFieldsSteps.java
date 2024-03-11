package com.tremend.practice.steps;

import net.thucydides.core.annotations.Step;
import com.tremend.practice.tpages.SimpleFormTwoInputFieldsPage;
import org.yecht.Data;

import static org.assertj.core.api.Assertions.assertThat;


public class SimpleFormTwoInputFieldsSteps {

    private SimpleFormTwoInputFieldsPage simpleFormTwoInputFieldsPage;

    @Step
    public void user_navigates_to_simple_form_page() {
        simpleFormTwoInputFieldsPage.navigateToSimpleFormPage();
    }

    @Step
    public void user_inputs_keys_into_input_field_a(String value) {
        simpleFormTwoInputFieldsPage.setInputFieldA(value);
    }

    @Step
    public void user_inputs_keys_into_input_field_b(String value) {
        simpleFormTwoInputFieldsPage.setInputFieldB(value);
    }

    @Step
    public void user_clicks_get_total_btn() {
        simpleFormTwoInputFieldsPage.clickGetTotalBtn();
    }

    @Step
    public void assert_that_get_total_show_value(Integer value1, Integer value2) {
        assertThat(simpleFormTwoInputFieldsPage.showGetTotalValueInteger()).as("Get Total displayed value is").isEqualTo(value1 + value2);
    }
    @Step
    public void assert_that_get_total_show_value(String value) {
        assertThat(simpleFormTwoInputFieldsPage.showGetTotalValueString()).as("Get Total displayed value is").isEqualTo(value);
    }
    @Step
    public void assert_get_total_value(String value){
        assertThat(simpleFormTwoInputFieldsPage.showGetTotalValueString()).as("Get Total displayed value is").isEqualTo(value);
    }

}