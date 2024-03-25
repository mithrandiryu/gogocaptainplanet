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


        public int getWebElementAttributeIndex(List<WebElementFacade> list, String attribute) {
            return IntStream.range(0, list.size())
                    .filter(i -> list.get(i).getAttribute("value").equals(attribute))
                    .findFirst()
                    .orElse(-1);

        }


        public enum sex {
            Male,
            Female
        }

        public enum ageGroup {
            ZERO_TO_FIVE,
            FIVE_TO_FIFTEEN,
            FIFTEEN_TO_FIFTY

        }
    }





