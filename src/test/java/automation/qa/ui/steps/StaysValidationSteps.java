package automation.qa.ui.steps;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import automation.qa.ui.tasks.StaysValid;
import automation.qa.ui.user_interface.StaysPage;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;


public class StaysValidationSteps {
    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Cuando("Selecciona la opcion buscar sin haber diligenciado nada")
    public void customerSearch() {
        theActorInTheSpotlight()
                .attemptsTo(StaysValid.customerSearch());
    }
    @Entonces("El sistema le mostrara un mensaje de alerta")
    public void customerSuccess() {
        WaitUntil.the(StaysPage.MESSAGE_ERROR, isPresent()).forNoMoreThan(30).seconds();
        theActorInTheSpotlight()
                .should(seeThat(the(StaysPage.MESSAGE_ERROR), WebElementStateMatchers.isVisible()));

    }

}
