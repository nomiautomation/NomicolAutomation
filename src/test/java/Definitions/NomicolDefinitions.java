package Definitions;

import Tests.NomicolTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.awt.*;

public class NomicolDefinitions {

    NomicolTest nomicolTest;

    @Given("^el usuario ingresa a la pagina de Nomicol$")
    public void elUsuarioIngresaALaPaginaDeNomicol() {
        nomicolTest.abrirPaginaNomicol();
    }


    @When("^el usuario  hace clic en Registrate$")
    public void elUsuarioHaceClicEnRegistrate() {
        nomicolTest.clicEnRegistrate();
    }

    @When("^el usuario diligencia el formulario de Empieza Ahora (.*), (.*), (.*), (.*)$")
    public void elUsuarioDiligenciaElFormularioDeEmpiezaAhora(String nombrePersonal, String nombreCompañia, String numeroEmpleados, String actividadEconomica) throws AWTException {
        nomicolTest.dilegenciarFormularioEmpiezaAhora(nombrePersonal, nombreCompañia, numeroEmpleados, actividadEconomica);
    }

    @When("^el usuario hace clic en el boton  Continuar$")
    public void elUsuarioHaceClicEnElBotonContinuar() {
        nomicolTest.clickEnBotonContinuar();
    }

    @When("^el usuario diligencia el segundo formulario de registro (.*), (.*), (.*)$")
    public void elUsuarioDiligenciaElSegundoFormularioDeRegistro(String telefonoTrabajo, String correoTrabajo, String contraseña) {
        nomicolTest.diligenciarSegundoFormularioDeRegistro(telefonoTrabajo, correoTrabajo, contraseña);
    }

    @When("^el usuario hace clic en el boton  Crear Cuenta$")
    public void elUsuarioHaceClicEnElBotonCrearCuenta() {
        nomicolTest.clickEnbotonCrearCuenta();
    }

    @When("^el usuario confirma su correo electronico (.*)$")
    public void elUsuarioConfirmaSuCorreoElectronico(String correo) {
        nomicolTest.abrirYopmailParaConfirmarCorreo(correo);
    }

    @When("^el Usuario termina el proceso de registro de su empresa$")
    public void elUsuarioTerminaElProcesoDeRegistroDeSuEmpresa() {

    }

    @Then("^el usuario puede ingresar a su empresa$")
    public void elUsuarioPuedeIngresarASuEmpresa() {

    }
}
