package com.tremend.practice.tpages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SimpleFormTwoInputFieldsPage extends PageObject {

    @FindBy(id = "value1")
    private WebElementFacade inputFieldA;

    @FindBy(id = "value2")
    private WebElementFacade inputFieldB;

    @FindBy(css = "#gettotal > button")
    private WebElementFacade getTotalButton;

    @FindBy(id = "displayvalue")
    private WebElementFacade getTotalResult;

    public void navigateToSimpleFormPage(){
        getDriver().navigate().to("https://demo.seleniumeasy.com/basic-first-form-demo.html");
    }

    public void setInputFieldA(String value){
        inputFieldA.sendKeys(value);
    }

    public void setInputFieldB(String value){
        inputFieldB.sendKeys(value);
    }

    public void clickGetTotalBtn(){
        getTotalButton.click();
    }

    public Integer showGetTotal(){

        String showValue = getTotalResult.getText();
        Integer i = Integer.valueOf(showValue);
        return i;

        //return getTotalResult.getText();
    }

}
