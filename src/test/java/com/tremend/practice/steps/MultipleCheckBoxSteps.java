package com.tremend.practice.steps;

import com.tremend.practice.tpages.MultipleCheckboxPage;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class MultipleCheckBoxSteps {

    private MultipleCheckboxPage multipleCheckboxPage;

    @Step
        public void user_navigates_to_multiple_checkbox_page(){
            multipleCheckboxPage.navigateToCheckBoxDemoPage();
    }

    @Step
        public void user_ticks_a_checkbox(int value){
            multipleCheckboxPage.tickCheckBox(value);
    }
    @Step
        public void user_unticks_a_checkbox(int value){
            multipleCheckboxPage.untickCheckBox(value);}

    @Step
        public void user_ticks_all_checkboxes_using_btn(){
            multipleCheckboxPage.tickUntickAllCheckBoxes();
    }

    @Step
        public void assert_that_the_checkbox_is_selected(int value){
            assertThat(multipleCheckboxPage.isCheckobxChecked(value)).as("Checkbox is ticked").isTrue();
    }
    @Step
        public void assert_that_the_checkbox_is_unselected(int value){
            assertThat(multipleCheckboxPage.isCheckobxChecked(value)).as("Checkbox is ticked").isFalse();
    }
}
