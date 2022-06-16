Feature: Registrar empresa

  @RegistrarEmpresa
  Scenario Outline:Como usuario de Nomicol quiero registrar una nueva empresa
    Given el usuario ingresa a la pagina de Nomicol
    When el usuario  hace clic en Registrate
    And el usuario diligencia el formulario de Empieza Ahora  <nombrePersonal>, <nombreCompania>, <numeroEmpleados>, <actividadEconomica>
    And el usuario hace clic en el boton  Continuar
    And el usuario diligencia el segundo formulario de registro <telefonoTrabajo>, <correoTrabajo>, <contraseña>
    And el usuario hace clic en el boton  Crear Cuenta
    When el usuario confirma su correo electronico <correoTrabajo>
    And el Usuario termina el proceso de registro de su empresa
    Then el usuario puede ingresar a su empresa
    Examples:
      | nombrePersonal | nombreCompania | numeroEmpleados | actividadEconomica      | telefonoTrabajo | correoTrabajo | contraseña |
      | Laura Duenas   | RedValley      | 6-20            | Agricultura / Ganadería | 3008974562      | @yopmail.com  | Test123!   |
