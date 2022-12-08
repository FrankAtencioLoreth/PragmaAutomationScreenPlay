package stepDefinition;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

public class LoginStepDefinitions {
    @Dado("^El cliente abre la página web$")
    public void elClienteAbreLaPaginaWeb() {
    }

    @Cuando("^El cliente ingresa (.*) y (.*)$")
    public void elClienteIngresaUsuarioYClave(String usuario, String clave) {
    }

    @Entonces("^El cliente ve su cuenta (.*)$")
    public void elClienteVeSuCuentaValidarTexto(String validarTexto) {
    }
}
