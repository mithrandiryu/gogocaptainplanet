package com.tremend.practice.steps;

import com.tremend.practice.tpages.MultipleCheckboxPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;


import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class MultipleCheckboxSteps {


    private MultipleCheckboxPage multipleCheckboxPage;

    @Step
    public void user_navigates_to_check_box_page() {
        multipleCheckboxPage.navigateToCheckBoxPage();
    }

    @Step
    public void user_click_check_all_button() {
        multipleCheckboxPage.checkAllButton();
    }


    @Step
    public void user_checks_if_options_are_checked() {
        List<WebElementFacade> radioButtons = multipleCheckboxPage.optionsListReturn();

        // Create a boolean flag to track if any option is not checked
        boolean allOptionsChecked = true;

        for (WebElementFacade option : radioButtons) {
            // If any option is not selected, set the flag to false and break the loop
            if (!option.isSelected()) {
                allOptionsChecked = false;
                break;
            }
        }

    }}



//    // un set care mapeaza campul optiunii
//            Set<Boolean> selected = optionsDisplayed.stream().map(option -> option.isSelected()).collect(Collectors.toSet());
//
//            // ne spune ca setul este gol sau nu
//            Assert.assertFalse(selected.isEmpty(),"Set is not empty");
//
//    // selectam setul, ia iterator si iteratorul primul element din set
//            Assert.assertTrue(selected.iterator().next(),"Checkbox si active");
//
//    // am un singur element in set
//            Assert.assertEquals(1,selected.size(),"One box is selected");
//        }
//
//    }



