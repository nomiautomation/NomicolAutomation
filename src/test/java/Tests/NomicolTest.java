package Tests;

import Localizadores.NomicolLocalizadores;
import net.serenitybdd.core.pages.PageObject;

public class NomicolTest extends PageObject {

    NomicolLocalizadores nomicolLocalizadores =new NomicolLocalizadores();

    public void abrirPaginaNomicol(){
        getDriver().get("https://app.qa.nomicol.redvalley.com/");
    }

    public  void clicEnRegistrate(){
        nomicolLocalizadores.botonRegistrate.click();
    }

    public  void dilegenciarFormularioEmpiezaAhora(String numeroEmpleados){
        nomicolLocalizadores.nombrePersonal.sendKeys("Laura Ardila");
        nomicolLocalizadores.nombredelaCompañía.sendKeys("Ganaderias Angus Brangus");
        nomicolLocalizadores.numeroEmpleados.click();

    }
}
