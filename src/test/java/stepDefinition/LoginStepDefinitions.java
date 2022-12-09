package stepDefinition;

import actions.HomePageQuestion;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.LoginTask;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepDefinitions {

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
    }//

    @Given("^El cliente abre la pagina web$")
    public void elClienteAbreLaPaginaWeb() {
        theActorCalled("usuario").attemptsTo(Open.url("https://demo.applitools.com/"));
    }

    @When("^El cliente ingresa sus credenciales (.*) y (.*)$")
    public void elClienteIngresaSusCredencialesY(String usuario, String clave) {
        theActorInTheSpotlight().wasAbleTo(
                LoginTask.loginPageInstrumented(usuario, clave)
        );
    }

    @Then("^El cliente ve su cuenta (.*)$")
    public void elClienteVeSuCuenta(String textoValido) {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        HomePageQuestion.homePageQuestionInstrumented(textoValido)
                )
        );
    }

}
