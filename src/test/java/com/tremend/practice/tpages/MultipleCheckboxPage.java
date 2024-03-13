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


    //   public void allOptionsChecked() {
    //        for (WebElementFacade option : optionsDisplayed) {
    //            Assert.assertTrue(option.isSelected(), "Option is not selected: " + option.getText());
    //        }
    //    Creating a method with enhanced complexity and broader coverage
         public void allOptionsChecked() {
        // un set care mapeaza campul optiunii
        Set<Boolean> selected = optionsDisplayed.stream().map(option -> option.isSelected()).collect(Collectors.toSet());

        // spune ca setul este gol sau nu
        Assert.assertFalse(selected.isEmpty(),"Set is bot empty");

        // selectam setul, ia iterator si iteratorul primul element din set
        Assert.assertTrue(selected.iterator().next(),"Checkbox si active");

        // am un singur element in set
         Assert.assertEquals(1,selected.size(),"One box is selected");
    }

    public void allOptionsUnchecked() {
        for (WebElementFacade option : optionsDisplayed) {
            Assert.assertFalse(option.isSelected(), "Option should not be selected: " + option.getText());
        }
    }
}