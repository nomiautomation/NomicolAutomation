Feature: Registrar empresa

  @RegistrarEmpresa
  Scenario:Como usuario de Nomicol quiero registrar una nueva empresa
    Given el usuario ingresa a la pagina de Nomicol
    When el usuario  hace clic en Registrate
    And el usuario diligencia el formulario de Empieza Ahora
    And el usuario hace clic en el boton  Continuar
    And el usuario diligencia el segundo formulario de registro
    And el usuario hace clic en el boton  Crear Cuenta
    When el usuario confirma su correo electronico
    And el Usuario termina el proceso de registro de su empresa
    Then el usuario puede ingresar a su empresa


