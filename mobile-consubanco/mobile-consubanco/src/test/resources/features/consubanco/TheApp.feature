Feature: Consulbanco

  @id:1 @Login
  Scenario: T-MOVIL-CA1-Loguearse en la apk
    Given que el usuario abre el apk
    When ingresamos usuario y contrasena
    Then sistema debe de permitir ingresar

  #OJO: para regresar a la página home se debe de teclear 3 veces la flecha de regreso, debido a que se presiona despues del logout
  @id:2 @Logout
  Scenario: T-MOVIL-CA2-Desloguearse en la apk
    Given que el usuario abre el apk
    And ingresamos usuario y contrasena
    And sistema debe de permitir ingresar
    And damos clic en logout
    When estamos en la pantalla de login damos clic en la flecha superior
    Then el sistema debe presentar la pagina de home

  @id:3 @PalabraFog
  Scenario: T-MOVIL-CA3-Visualizar la Palabra Fog
    Given que el usuario da clic en List Demo
    And despues da clic en Fog
    When despues da clic en Learn More About Fog
    Then el sistema muestra un mensaje con la palabra Fog

