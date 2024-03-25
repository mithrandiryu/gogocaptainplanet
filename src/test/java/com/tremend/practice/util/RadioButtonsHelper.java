package com.tremend.practice.util;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;
import java.util.stream.IntStream;


   // Metoda verifica cand radio button trebuie sa fie bifat  avand valorile
   // Verifice statusul radio button
   // Daca este statusul asteptat este diferit de starea curenta face click pe radio button
   // pentru a-si schimba starea




public class RadioButtonsHelper extends PageObject {

    public static void clickCheckMarksButton(String value, WebElementFacade button) {
        boolean shouldBeChecked = "checked".equals(value);
        boolean isCurrentlyChecked = button.isSelected();

        if (shouldBeChecked != isCurrentlyChecked) {
            button.click();
        }
    }

    public static int getWebElementAttributeIndex(List<WebElementFacade> list, String attribute) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAttribute("value").equals(attribute)) {
                return i;
            }
        }
        return -1; // Element not found
    }
}


