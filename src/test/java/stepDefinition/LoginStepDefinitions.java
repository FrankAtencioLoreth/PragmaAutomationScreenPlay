package stepDefinition;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class LoginStepDefinitions {

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
    }

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
