package Localizadores;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.support.FindBy;

public class NomicolLocalizadores extends PageObject {

    @FindBy(xpath = "//a[text()='REGÍSTRATE']")
    public WebElementFacade botonRegistrate;

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElementFacade nombrePersonal;

    @FindBy(xpath = "//input[@name='name']")
    public WebElementFacade nombredelaCompañía;

    @FindBy(xpath = "(//div[@class=' css-tlfecz-indicatorContainer'])[1]")
    public WebElementFacade abrirListaNumeroEmpleados;

    @FindBy(xpath = "(//div[@class=' css-tlfecz-indicatorContainer'])[1]")
    public WebElementFacade abrirListaActividadEconomica;

    @FindBy(xpath = "//button[text()='Continuar']")
    public WebElementFacade botonContinuar;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElementFacade telefonoDeTrabajo;

    @FindBy(xpath = "//input[@name='email']")
    public WebElementFacade correoDeTrabajo;

    @FindBy(xpath = "//input[@name='password']")
    public WebElementFacade campoPassword;

    @FindBy(xpath = "//input[@name='confirmPassword']")
    public WebElementFacade campoConfirmPassword;

    @FindBy(xpath = "//button[text()='Crear cuenta']")
    public WebElementFacade botonCrearCuenta;

    public WebElementFacade selecNumEmpleados(String numEmplados) {
        return $("//div[text()='" + numEmplados + "']");
    }

    public WebElementFacade selecActividadEmpresarial(String actividad) {
        return $("//div[text()='" + actividad + "']");
    }
}
