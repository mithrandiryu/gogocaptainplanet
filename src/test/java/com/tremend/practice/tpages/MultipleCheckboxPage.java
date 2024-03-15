package com.tremend.practice.tpages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.testng.Assert;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MultipleCheckboxPage extends PageObject {


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


    public List<WebElementFacade> getAllCheckBoxesReturn(){
        return optionsDisplayed;
    }

    //    Metoda de mai jos verifica daca optiunile sunt bifate
    public void allOptionsChecked() {
        // un set care mapeaza campul optiunii
        Set<Boolean> selected = optionsDisplayed.stream().map(option -> option.isSelected()).collect(Collectors.toSet());

        // ne spune ca setul este gol sau nu
        Assert.assertFalse(selected.isEmpty(),"Set is not empty");

        // selectam setul, ia iterator si iteratorul primul element din set
        Assert.assertTrue(selected.iterator().next(),"Checkbox si active");

        // am un singur element in set
        Assert.assertEquals(1,selected.size(),"One box is selected");
    }

    // I will create two methods for this step
   /* public void allOptionsChecked() {

        for (WebElementFacade option : optionsDisplayed) {
            Assert.assertTrue(option.isSelected(), "Option is selected: " + option.getText());
        }
    }*/

    public void unCheckAllOptions(){
        clickCheckMarksButton.click();

    }
    public void user_checks_if_options_are_Unchecked(){

        for(WebElementFacade option : optionsDisplayed){
            Assert.assertFalse(option.isSelected(), "Option is ticked: " + option.getText());
        }
}}