#language: es
Característica: Login

  @LoginCorrecto
  Esquema del escenario: Login
    Dado El cliente abre la página web
    Cuando El cliente ingresa usuario y clave
    Entonces El cliente ve su cuenta validarTexto
    Ejemplos:
      | usuario | clave    | validarTexto                          |
      | admin   | Admin123 | Your nearest branch closes in: 30m 5s |