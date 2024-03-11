package com.tremend.practice.steps;

import com.tremend.practice.tpages.SimpleFormPage;
import net.thucydides.core.annotations.Step;
import static org.assertj.core.api.Assertions.assertThat;

public class SimpleFormSteps {

    private SimpleFormPage simpleFormPage;

    @Step
    public void user_navigates_to_simple_form_page(){
        simpleFormPage.navigateToSimpleFormPage();
    }

    @Step
    public void user_inputs_keys_into_input_field(String value) {simpleFormPage.setInputField(value);}

    @Step
    public void user_clears_the_simple_form_input_field(){
        simpleFormPage.clearInputField();
    }

    @Step
    public void user_click_the_submit_button(){
        simpleFormPage.clickShowMessageBtn();
    }


    @Step
    public void assert_that_the_field_has_this_value(String value){
        assertThat( simpleFormPage.getTextShowMessageLabel() ).as("Simple Form page label displayed value").isEqualTo(value);
    }

    @Step
    public void assert_that_element_is_displayed_value_is(boolean value){
        assertThat( simpleFormPage.isDisplayedMessageLabel() ).as("Simple Form message label is displayed").isEqualTo(value);
    }




}
