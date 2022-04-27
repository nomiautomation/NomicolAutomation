package Utilidades;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;

public class Utilidades  extends PageObject {

    public void seleccionarNumeroEmpleados (String numeroEmpleados, WebElementFacade elementFacade) {
        switch (numeroEmpleados) {
            case "1-5":
                elementFacade.sendKeys(Keys.ENTER);
                break;
            case "6-20":
                elementFacade.sendKeys(Keys.ARROW_DOWN);
                elementFacade.sendKeys(Keys.ENTER);
                break;
            case "21-50":
                elementFacade.sendKeys(Keys.ARROW_DOWN);
                elementFacade.sendKeys(Keys.ARROW_DOWN);
                elementFacade.sendKeys(Keys.ENTER);
                break;
            case "51-100":
                elementFacade.sendKeys(Keys.ARROW_DOWN);
                elementFacade.sendKeys(Keys.ARROW_DOWN);
                elementFacade.sendKeys(Keys.ARROW_DOWN);
                elementFacade.sendKeys(Keys.ENTER);
                break;
            case "Mas de 100":
                elementFacade.sendKeys(Keys.ARROW_DOWN);
                elementFacade.sendKeys(Keys.ARROW_DOWN);
                elementFacade.sendKeys(Keys.ARROW_DOWN);
                elementFacade.sendKeys(Keys.ARROW_DOWN);
                elementFacade.sendKeys(Keys.ENTER);
                break;
            case "No tengo Empleados":
                elementFacade.sendKeys(Keys.ARROW_DOWN);
                elementFacade.sendKeys(Keys.ARROW_DOWN);
                elementFacade.sendKeys(Keys.ARROW_DOWN);
                elementFacade.sendKeys(Keys.ARROW_DOWN);
                elementFacade.sendKeys(Keys.ARROW_DOWN);
                elementFacade.sendKeys(Keys.ENTER);
                break;
        }
    }
}
