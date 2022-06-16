package Tests;

import Localizadores.NomicolLocalizadores;
import Localizadores.YopMailLocalizadores;
import Utilidades.Utilidades;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;

import java.awt.*;
import java.util.UUID;

public class NomicolTest extends PageObject {

    NomicolLocalizadores nomicolLocalizadores;
    YopMailLocalizadores yopMailLocalizadores;
    Utilidades utilidades;

    UUID uuid = UUID.randomUUID();
    String id = uuid.toString();

    public void abrirPaginaNomicol() {
        getDriver().get("https://app.qa.nomicol.redvalley.com/");
    }

    public void clicEnRegistrate() {
        nomicolLocalizadores.botonRegistrate.click();
    }

    public void dilegenciarFormularioEmpiezaAhora(String nombrePersonal, String nombreCompañia, String numeroEmpleados, String actidadEconomica) throws AWTException {
        String[]idrandom=id.split("-");
        nomicolLocalizadores.nombrePersonal.sendKeys(nombrePersonal);
        nomicolLocalizadores.nombredelaCompañía.sendKeys(nombreCompañia.concat(idrandom[0]));
        nomicolLocalizadores.abrirListaNumeroEmpleados.click();
        nomicolLocalizadores.selecNumEmpleados(numeroEmpleados).click();
        nomicolLocalizadores.abrirListaActividadEconomica.click();
        nomicolLocalizadores.selecActividadEmpresarial(actidadEconomica).click();
    }

    public void clickEnBotonContinuar() {
        waitFor(nomicolLocalizadores.botonContinuar).waitUntilClickable().and().click();
    }

    public void diligenciarSegundoFormularioDeRegistro(String telefonoTrabajo, String correoTrabajo, String contraseña) {
        String[]idrandom=id.split("-");
        waitFor(nomicolLocalizadores.telefonoDeTrabajo).waitUntilEnabled().and().type(telefonoTrabajo);
        nomicolLocalizadores.correoDeTrabajo.type(idrandom[0].concat(correoTrabajo));
        nomicolLocalizadores.campoPassword.type(contraseña);
        nomicolLocalizadores.campoConfirmPassword.type(contraseña);
    }

    public void clickEnbotonCrearCuenta() {
        waitFor(nomicolLocalizadores.botonCrearCuenta).waitUntilClickable().and().click();
    }

    public void abrirYopmailParaConfirmarCorreo(String correo) {
        String[]idrandom=id.split("-");
        waitFor(3).seconds();
        ((JavascriptExecutor) getDriver()).executeScript("window.open()");
        utilidades.switchToTab(1);
        getDriver().get("https://yopmail.com/es/");
        yopMailLocalizadores.casillaEmail.type(idrandom[0].concat(correo));
        yopMailLocalizadores.iconoFlecha.click();
        getDriver().switchTo().frame("ifmail");
        waitFor(2).seconds();
        yopMailLocalizadores.botonVerificaTuCorreoElectronico.click();
        utilidades.switchToTab(2);
        waitFor(2).seconds();
    }
}
