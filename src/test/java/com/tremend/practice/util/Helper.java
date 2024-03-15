package com.tremend.practice.util;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jetbrains.annotations.NotNull;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Helper extends PageObject {
    public void checkBoxIsChecked(String checkBoxState, WebElementFacade button){

        if ("checked".equals(checkBoxState) && !button.isSelected()){
            button.click();
        } else if ("unchecked".equals(checkBoxState) && button.isSelected()){
            button.click();
        }
    }
    public int getWebElementAttributeIndex(@NotNull List<WebElementFacade> list, String attribute){
        Map<String, Integer> map = new HashMap<>();

        for (int index = 0; index < list.size(); index++){
            map.put(list.get(index).getAttribute("value"), index);
        }
        return map.get(attribute);
    }
}
