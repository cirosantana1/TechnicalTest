package automation.qa.ui.tasks;

import static automation.qa.ui.user_interface.StaysPage.GOING_TO;
import static automation.qa.ui.user_interface.StaysPage.SEARCH_BTN;


import automation.qa.ui.user_interface.StaysPage;
import lombok.Data;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.Keys;

@Data
public class Stays implements Task {

    private final String goingTo;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(GOING_TO),
                Enter.theValue(goingTo).into(StaysPage.GOING_TO1)
                .thenHit(Keys.ENTER),
                Scroll.to(SEARCH_BTN),
                Click.on(SEARCH_BTN)
        );
    }

    public static Performable withStaysData(String goingTo) {
        return Instrumented.instanceOf(Stays.class)
                .withProperties(goingTo);
    }


}


