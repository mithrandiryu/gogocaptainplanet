package com.tremend.practice.tpages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SingleCheckBoxPage extends PageObject {


    /**
     * ===== WEB ELEMENTS ====
     */


    @FindBy(id = "isAgeSelected")
    private WebElementFacade checkBox;


    @FindBy(xpath = "//label[@class='checkbox-inline']")
    private WebElementFacade defaultChecked;


    @FindBy(id = "txtAge")
    private WebElementFacade checkboxTextAge;


    /**
     * ====METHODS====
     */

    public void navigateToCheckBoxPage() {
        getDriver().navigate().to("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
    }

    public boolean checkBoxChecked() {
        return checkBox.isSelected();
    }

    public void clickFirstCheckBox() {
        checkBox.click();
    }

    public boolean checkDefaultBox() {
        return defaultChecked.isSelected();
    }

    public void clickDefaultChecked() {
        defaultChecked.click();
    }

}