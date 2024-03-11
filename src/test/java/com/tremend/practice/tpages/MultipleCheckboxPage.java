package com.tremend.practice.tpages;

import com.tremend.practice.util.Helper;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class MultipleCheckboxPage extends PageObject {

    private Helper helper;

    @FindBy (className = "cb1-element")
    private List<WebElementFacade> checBoxOptionsList;

    @FindBy (id = "check1")
    private WebElementFacade checkUncheckAllBtn;

    public void navigateToCheckBoxDemoPage(){
        getDriver().navigate().to("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
    }

    public void tickCheckBox(int value){
        helper.checkBoxIsChecked("checked",checBoxOptionsList.get(value));
    }
    public void untickCheckBox(int value){
        helper.checkBoxIsChecked("unchecked", checBoxOptionsList.get(value));
    }

    public boolean isCheckobxChecked(int value){
        return checBoxOptionsList.get(value).isSelected();
    }

    public void tickUntickAllCheckBoxes(){
        checkUncheckAllBtn.click();
    }
}
