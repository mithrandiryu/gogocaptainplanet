package com.tremend.practice.tpages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class TwoInputFieldsPage extends PageObject {


    /**
     * ===== WEB ELEMENTS ====
     */


    @FindBy(id = "value1")
    private WebElementFacade inputFieldA;


    @FindBy(id = "value2")
    private WebElementFacade inputFieldB;


    @FindBy(css = "#gettotal > button")
    private WebElementFacade getTotalButton;


    @FindBy(id = "displayvalue")
    private WebElementFacade getTotalValue;


    /**
     * ==== METHODS ====
     */

    public void navigateToSimpleFormPage() {
        getDriver().navigate().to("https://demo.seleniumeasy.com/basic-first-form-demo.html");
    }

    public void setInputFieldA(String value) {
        inputFieldA.sendKeys(value);
    }

    public void setInputFieldB(String value) {
        inputFieldB.sendKeys(value);
    }

    public void clickGetTotalBtn() {
        getTotalButton.click();
    }

    public Integer showGetTotalValueInteger() {
        String showValue = getTotalValue.getText();
        return Integer.valueOf(showValue);
    }

    public String showGetTotalValueString() {
        return getTotalValue.getText();
    }
}