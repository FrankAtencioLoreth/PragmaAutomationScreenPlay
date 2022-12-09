package actions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userInterfaces.HomePage;

public class HomePageQuestion implements Question<Boolean>{

    private String validText;

    public HomePageQuestion(String validText) {
        this.validText = validText;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        if( Text.of(HomePage.TIME_LBL).viewedBy(actor).asString().equals(this.validText.toString()) )
            return true;
        else
            return false;
    }

    public static HomePageQuestion homePageQuestionInstrumented(String validText) {
        return new HomePageQuestion(validText);
    }
}
