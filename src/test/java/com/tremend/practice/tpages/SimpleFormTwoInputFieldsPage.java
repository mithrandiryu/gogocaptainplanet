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

    public void setInputField(String valueA, String valueB){
        inputFieldA.sendKeys(valueA);
        inputFieldB.sendKeys(valueB);
    }

    public void clickGetTotalBtn(){
        getTotalButton.click();
    }

    public String showGetTotal(){
        return getTotalResult.getText();
    }


}
