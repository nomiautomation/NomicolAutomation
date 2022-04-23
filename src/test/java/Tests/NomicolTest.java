package Tests;

import net.serenitybdd.core.pages.PageObject;

public class NomicolTest extends PageObject {

    public void abrirPaginaNomicol(){
        getDriver().get("https://app.qa.nomicol.redvalley.com/");
    }
}
