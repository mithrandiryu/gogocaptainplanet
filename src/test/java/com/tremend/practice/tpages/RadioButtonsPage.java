package com.tremend.practice.tpages;

import com.tremend.practice.util.RadioButtonsHelper;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class RadioButtonsPage extends PageObject {

    private RadioButtonsHelper radioButtonsHelper;


    /**
     * ====WEB ELEMENTS====
     */

    @FindBy(name = "gender")
    private List<WebElementFacade> genderOptions;

    @FindBy(name = "ageGroup")
    private List<WebElementFacade> ageGroupOptions;

    @FindBy(className = "groupradiobutton")
    private WebElementFacade outcomeLabel;

    @FindBy(css = "#get-input > button")
    private WebElementFacade retrieveDataButton;


    /**
     * ====METHODS====
     */
    public void navigateToDemoPage() {
        getDriver().navigate().to("https://demo.seleniumeasy.com/basic-first-form-demo.html");
    }

    public void userSelectsSex(String gender) {
        RadioButtonsHelper.clickCheckMarksButton("checked", genderOptions.get(Integer.parseInt(gender.trim())));
    }

    public void userSelectsAgeGroup(String ageGroup) {
        RadioButtonsHelper.clickCheckMarksButton("checked", genderOptions.get(Integer.parseInt(ageGroup.trim())));
    }

    public boolean isSexRadioButtonChecked(String value) {
        return !value.isEmpty() && genderOptions.stream()
                .filter(element -> element.getAttribute("value").equals(value))
                .findFirst()
                .map(WebElementFacade::isSelected)
                .orElse(false);
    }

    public boolean isAgeGroupButtonChecked(String value) {
        return !value.isEmpty() && ageGroupOptions.stream()
                .filter(element -> element.getAttribute("value").equals(value))
                .findFirst()
                .map(WebElementFacade::isSelected)
                .orElse(false);
}
}