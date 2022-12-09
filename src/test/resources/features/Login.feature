#language: en
Feature: Login
  Como usuario registrado
  Quiero poder logearme
  Para ingresar a mi cuenta

  @LoginCorrecto
  Scenario Outline: Login
    Given El cliente abre la pagina web
    When El cliente ingresa sus credenciales <usuario> y <clave>
    Then El cliente ve su cuenta <validarTexto>
    Examples:
      | usuario | clave    | validarTexto                          |
      | admin   | Admin123 | Your nearest branch closes in: 30m 5s |