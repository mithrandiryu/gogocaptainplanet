package com.tremend.practice.steps;

import net.thucydides.core.annotations.Step;
import com.tremend.practice.tpages.SimpleFormTwoInputFieldsPage;


public class SimpleFormTwoInputFieldsSteps {

    SimpleFormTwoInputFieldsPage simpleFormTwoInputFieldsPage;

    @Step
    public void user_navigates_to_simple_form_page() {
        simpleFormTwoInputFieldsPage.navigateToSimpleFormPage(); }

