package com.tremend.practice.tpages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

public class SimpleFormPage extends PageObject {

    // ============ WebElemends

    @FindBy(id = "user-message")
    private WebElementFacade inputField;

    @FindBy(css = "#get-input > button")
    private WebElementFacade showMessageButton;

    @FindBy(id = "display")
    private WebElementFacade showMessageLabel;


    // ===== Methods

    public void navigateToSimpleFormPage(){
        getDriver().navigate().to("https://demo.seleniumeasy.com/basic-first-form-demo.html");
    }

    public void setInputField(String value){
        inputField.sendKeys(value);
    }

    public void clearInputField(){
        inputField.clear();
    }

    public void clickShowMessageBtn(){
        showMessageButton.click();
    }

    public String getTextShowMessageLabel(){
        return showMessageLabel.getText();
    }

    public boolean isDisplayedMessageLabel(){
        return showMessageLabel.isVisible();
    }



}
