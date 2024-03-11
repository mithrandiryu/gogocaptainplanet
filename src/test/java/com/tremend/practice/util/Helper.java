package com.tremend.practice.util;

import com.openhtmltopdf.css.parser.property.PrimitivePropertyBuilders;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class Helper extends PageObject {
    public void checkBoxIsChecked(String value, WebElementFacade button){
        if ("checked".equals(value) && !button.isSelected()){
            button.click();
        } else if ("unchecked".equals(value) && button.isSelected()){
            button.click();
        }
    }
    public List<WebElementFacade> returnWebElementList(List<WebElementFacade> list){
        return list;
    }

    //    public void checkBoxIsChecked(@NotNull WebElementFacade button) {
//        if (!button.isSelected()) {
//            button.click();
//        }
//    }
}
