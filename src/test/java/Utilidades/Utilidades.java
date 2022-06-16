package Utilidades;

import net.serenitybdd.core.pages.PageObject;

import java.util.ArrayList;

public class Utilidades  extends PageObject {

    public void switchToTab(int tab){
        ArrayList<String> tabs = new ArrayList<>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs.get(tab));
    }
}