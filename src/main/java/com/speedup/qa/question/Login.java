package com.speedup.qa.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.speedup.qa.userinterfaces.login.VALIDATE_LOGIN;

public class Login implements Question<String>{

    @Override
    public String answeredBy(Actor actor) {
        //Una comparaciópn igual a y que sea visible
        actor.attemptsTo(WaitUntil.the((VALIDATE_LOGIN), WebElementStateMatchers.isVisible()));
        return Text.of(VALIDATE_LOGIN).viewedBy(actor).asString();
    }
    public static Login message(){
        return new Login();
    }
}