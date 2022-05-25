package Tests;

import Localizadores.NomicolLocalizadores;
import Utilidades.Utilidades;
import net.serenitybdd.core.pages.PageObject;

import java.awt.*;

public class NomicolTest extends PageObject {

    NomicolLocalizadores nomicolLocalizadores;
    Utilidades utilidades;

    public void abrirPaginaNomicol() {
        getDriver().get("https://app.qa.nomicol.redvalley.com/");
    }

    public void clicEnRegistrate() {
        nomicolLocalizadores.botonRegistrate.click();
    }

    public void dilegenciarFormularioEmpiezaAhora(String nombrePersonal, String nombreCompañia, String numeroEmpleados, String actidadEconomica) throws AWTException {
        waitFor(3).seconds();
        nomicolLocalizadores.nombrePersonal.sendKeys(nombrePersonal);
        nomicolLocalizadores.nombredelaCompañía.sendKeys(nombreCompañia);
        nomicolLocalizadores.abrirListaNumeroEmpleados.click();
        utilidades.seleccionarNumeroEmpleados(numeroEmpleados);
        waitFor(2).seconds();
        nomicolLocalizadores.abrirListaActividadEconomica.click();
        utilidades.seleccionarActividadEconomica(actidadEconomica);
        waitFor(nomicolLocalizadores.botonContinuar).waitUntilClickable().and().click();
    }
}