package userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target USERNAME_INPUT = Target.the("username input").located(By.id("username"));
    public static final Target PASSWORD_INPUT = Target.the("password input").located(By.id("password"));
    public static final Target LOGIN_BUTTON = Target.the("Login button").located(By.id("log-in"));
}
