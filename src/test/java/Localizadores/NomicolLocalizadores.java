package Localizadores;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public  class NomicolLocalizadores extends PageObject {

    public NomicolLocalizadores() {
    }

    @FindBy(xpath="//a[text()='REGÍSTRATE']")
    public WebElementFacade botonRegistrate;

    @FindBy(xpath="//input[@name='firstName']")
    public WebElementFacade nombrePersonal;

    @FindBy(xpath="//input[@name='name']")
    public WebElementFacade nombredelaCompañía;

    @FindBy(xpath="(//div[@class=' css-tlfecz-indicatorContainer'])[1]")
    public WebElementFacade abrirListaNumeroEmpleados;

    @FindBy(xpath="(//div[@class=' css-tlfecz-indicatorContainer'])[1]")
    public WebElementFacade abrirListaActividadEconomica;

    @FindBy(xpath="//button[text()='Continuar']")
    public WebElementFacade botonContinuar;
}