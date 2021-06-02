package automation.qa.ui.tasks;

import automation.qa.ui.user_interface.SearchResultPage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.apache.commons.lang3.StringUtils;

public class HotelResults implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SearchResultPage.HOTEL_RESULT)
        );
    }

    public static HotelResults customerSearchHotel() {
        return Instrumented.instanceOf(HotelResults.class).withProperties(StringUtils.EMPTY);
    }

}
