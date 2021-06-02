package automation.qa.ui.tasks;

import automation.qa.ui.user_interface.StaysPage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.apache.commons.lang3.StringUtils;


public class StaysValid implements Task{

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(StaysPage.SEARCH_BTN)
        );
    }

    public static StaysValid customerSearch() {
        return Instrumented.instanceOf(StaysValid.class).withProperties(StringUtils.EMPTY);
    }

}
