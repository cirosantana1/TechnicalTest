package automation.qa.ui.tasks;

import automation.qa.ui.user_interface.CarsPage;
import lombok.Data;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;


@Data
public class Cars implements Task {

    private final String pickUp;
    private final String sameUp;
    private final String pickUpTime;
    private final String dropOffTime;


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CarsPage.CARS_BTN),
                Click.on(CarsPage.DELIVERY),
                Enter.theValue(pickUp).into(CarsPage.DELIVERY01)
                        .thenHit(Keys.ENTER),
                Click.on(CarsPage.RETURN),
                Enter.theValue(sameUp).into(CarsPage.RETURN01)
                        .thenHit(Keys.ENTER),
                Click.on(CarsPage.PICKUP_TIME),
                SelectFromOptions.byValue(pickUpTime).from(CarsPage.PICKUP_TIME),
                Click.on(CarsPage.DROPOFF_TIME),
                SelectFromOptions.byValue(dropOffTime).from(CarsPage.DROPOFF_TIME),
                Click.on(CarsPage.SEARCH_BTN)
        );
    }

    public static Performable withCarsData(String pickUp, String sameUp,String pickUpTime,String dropOffTime) {
        return Instrumented.instanceOf(Cars.class)
                .withProperties(pickUp, sameUp, pickUpTime, dropOffTime);
    }
}
