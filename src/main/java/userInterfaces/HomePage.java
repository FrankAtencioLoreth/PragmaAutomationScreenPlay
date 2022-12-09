package userInterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static Target TIME_LBL = Target.the("Time Label").located(By.id("time"));
}
