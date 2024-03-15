package com.tremend.practice.util;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


   // Metoda verifica cand radio button trebuie sa fie bifat  avand valorile
   // Verifice statusul radio button
   // Daca este statusul asteptat este diferit de starea curenta face click pe radio
   // pentru a-si schimba starea

    public class RadioButtonsHelper extends PageObject {

        public void clickCheckMarksButton(String value, WebElementFacade button) {
            boolean shouldBeChecked = "checked".equals(value);
            boolean isCurrentlyChecked = button.isSelected();

            if (shouldBeChecked != isCurrentlyChecked) {
                button.click();
            }
        }
    }
