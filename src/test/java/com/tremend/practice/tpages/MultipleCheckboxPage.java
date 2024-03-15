package com.tremend.practice.tpages;

import com.tremend.practice.util.RadioButtonsHelper;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


import java.util.List;


public class MultipleCheckboxPage extends PageObject {

    private RadioButtonsHelper radioButtonsHelper;

    /**
     * =====WEB ELEMENTS====
     */

    @FindBy(className = "cb1-element")
    private List<WebElementFacade> optionsDisplayed;

    @FindBy(id = "check1")
    private WebElementFacade clickCheckMarksButton;


    /**
     * ====METHODS====
     */

    public void navigateToCheckBoxPage() {
        getDriver().navigate().to("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
    }


    public void checkAllButton() {
        clickCheckMarksButton.click();
    }


    public List<WebElementFacade> optionsListReturn(){
        return optionsDisplayed;
    }




}