package Definitions;

import Tests.NomicolTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NomicolDefinitions {
    NomicolTest nomicolTest = new NomicolTest();

    @Given("^el usuario ingresa a la pagina de Nomicol$")
    public void elUsuarioIngresaALaPaginaDeNomicol() {
        nomicolTest.abrirPaginaNomicol();
    }


    @When("^el usuario  hace clic en Registrate$")
    public void elUsuarioHaceClicEnRegistrate() {
        nomicolTest.clicEnRegistrate();
    }


    @When("^el usuario diligencia el formulario de Empieza Ahora$")
    public void elUsuarioDiligenciaElFormularioDeEmpiezaAhora() {
     nomicolTest.dilegenciarFormularioEmpiezaAhora("");
    }

    @When("^el usuario hace clic en el boton  Continuar$")
    public void elUsuarioHaceClicEnElBotonContinuar() {

    }

    @When("^el usuario diligencia el segundo formulario de registro$")
    public void elUsuarioDiligenciaElSegundoFormularioDeRegistro() {

    }

    @When("^el usuario hace clic en el boton  Crear Cuenta$")
    public void elUsuarioHaceClicEnElBotonCrearCuenta() {

    }

    @When("^el usuario confirma su correo electronico$")
    public void elUsuarioConfirmaSuCorreoElectronico() {

    }

    @When("^el Usuario termina el proceso de registro de su empresa$")
    public void elUsuarioTerminaElProcesoDeRegistroDeSuEmpresa() {

    }

    @Then("^el usuario puede ingresar a su empresa$")
    public void elUsuarioPuedeIngresarASuEmpresa() {

    }
}
