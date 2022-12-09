package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import userInterfaces.LoginPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginTask implements Task {

    private String usuario;
    private String clave;

    public LoginTask(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(this.usuario).into(LoginPage.USERNAME_INPUT).thenHit(Keys.TAB),
                Enter.theValue(this.clave).into(LoginPage.PASSWORD_INPUT),
                Click.on(LoginPage.LOGIN_BUTTON)
        );
    }

    public static LoginTask loginPageInstrumented(String usuario, String clave) {
        return instrumented(LoginTask.class, usuario, clave);
    }
}
