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

    @FindBy(css = "#easycont div.panel-body > button")
    private WebElementFacade retrieveDataButton;


    /**
     * ====METHODS====
     */
    public void navigateToDemoPage() {
        getDriver().navigate().to("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
    }


    // In summary, this method is used to select a gender option in a
    // user interface. It first attempts to find the index of the
    // specified gender option and then clicks on the corresponding
    // radio button if found. If the specified gender option is not found
    // it prints a message indicating that to the console

    public void userSelectsSex(String gender) {
        int index = RadioButtonsHelper.getWebElementAttributeIndex(genderOptions, gender);
        if (index != -1) {
            RadioButtonsHelper.clickCheckMarksButton("checked", genderOptions.get(index));
        } else {
            // Handle the case where the gender option is not found
            System.out.println("Gender option not found: " + gender);
        }
    }


     public void userSelectsAgeGroup(String ageGroup) {
         int index = RadioButtonsHelper.getWebElementAttributeIndex(ageGroupOptions, ageGroup);
         if (index != -1) {
             RadioButtonsHelper.clickCheckMarksButton("checked", ageGroupOptions.get(index));
         } else {
             // Handle the case where the age group is not found
             System.out.println("Age Group option not found: " + ageGroup);
         }
     }
            public void clickRetrieveDataButton () {
                retrieveDataButton.click();
            }

            public String getOutcomeText () {
                return outcomeLabel.getText();
            }
        }





