package automation.qa.ui.steps;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import automation.qa.ui.tasks.Cars;
import automation.qa.ui.dtos.CarsData;

import automation.qa.ui.user_interface.CarsResultPage;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import java.util.List;
import java.util.Map;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class CarsSteps {

    @DataTableType
    public CarsData convertCars(Map<String, String> entry) {
        return new CarsData(
                entry.get("entrega"),
                entry.get("devolucion"),
                entry.get("horaEntrega"),
                entry.get("horaDevolucion"));
    }

    //@Managed public WebDriver hisBrowser;

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Cuando("Digita la informacion de para buscar un auto para rentar")
    public void customerEnterCarsData(List<CarsData> carsDataList) {
        theActorInTheSpotlight()
                .attemptsTo(
                        Cars.withCarsData(
                                carsDataList.get(0).pickUp,
                                carsDataList.get(0).sameUp,
                                carsDataList.get(0).pickUpTime,
                                carsDataList.get(0).dropOffTime));
    }
    @Entonces("El sistema le mostrara los resultados de la busqueda para el auto")
    public void customerSuccess() {
        WaitUntil.the(CarsResultPage.MESSAGE_COVID, isPresent()).forNoMoreThan(30).seconds();
        theActorInTheSpotlight()
                .should(seeThat(the(CarsResultPage.OrderBy), WebElementStateMatchers.isVisible()));

    }
}
