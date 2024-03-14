package com.tremend.practice.tpages;

import net.serenitybdd.core.pages.PageObject;
import com.tremend.practice.util.Helper;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class RadioButtonPage extends PageObject {

    private Helper helper;

    @FindBy(name = "gender")
    private List<WebElementFacade> genderList;

    @FindBy(name = "ageGroup")
    private List<WebElementFacade> ageGroupList;

    @FindBy(css = "#easycont div.panel-body > button")
    private WebElementFacade getValuesBtn;

    @FindBy(className = "groupradiobutton")
    private WebElementFacade resultLabel;

    public void navigateToCheckBoxDemoPage(){
        getDriver().navigate().to("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
    }
    public boolean isGenderRadioButtonChecked(@NotNull String value) {
        if (!value.isEmpty()) {
            return genderList.get(helper.getWebElementAttributeIndex(genderList, value)).isSelected();
        }
        return false;
    }
    public boolean isAgeGroupRadioButtonChecked(@NotNull String value) {
        if (!value.isEmpty()) {
            return ageGroupList.get(helper.getWebElementAttributeIndex(ageGroupList, value)).isSelected();
        }
        return false;
    }
    public String getResultLabel (){
        return resultLabel.getText();
    }
    public void clickGetValuesBtn(){
        getValuesBtn.click();
    }
    public void userTicksGenderRadioButtonBasedOnAttribute(@NotNull String value) {
        if (!value.isEmpty()) {
            helper.checkBoxIsChecked("checked", genderList.get(helper.getWebElementAttributeIndex(genderList, value)));
        }
    }
    public void userTicksAgeGroupRadioButtonBasedOnAttribute(@NotNull String value) {
        if (!value.isEmpty()) {
            helper.checkBoxIsChecked("checked", ageGroupList.get(helper.getWebElementAttributeIndex(ageGroupList, value)));
        }
    }
}
