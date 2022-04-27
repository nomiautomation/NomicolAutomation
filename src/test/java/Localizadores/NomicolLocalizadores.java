package Localizadores;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public  class NomicolLocalizadores extends PageObject {

    public NomicolLocalizadores() {
    }

    @FindBy(xpath = "//a[text()='REGÍSTRATE']")
    public  WebElementFacade botonRegistrate;//Modificador de acceso

    @FindBy(xpath = "//input[@name='firstName']")
    public  WebElementFacade nombrePersonal;

    @FindBy(xpath = "//input[@name='name']")
    public  WebElementFacade nombredelaCompañía;

    @FindBy(xpath = "//input[@id='react-select-2-input']")
    public  WebElementFacade numeroEmpleados;

    @FindBy(xpath = "//input[@id='react-select-3-input']")
    public  WebElementFacade actividadEconomica;
}