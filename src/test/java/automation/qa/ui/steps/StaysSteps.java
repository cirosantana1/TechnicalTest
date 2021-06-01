package automation.qa.ui.steps;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static org.hamcrest.CoreMatchers.containsString;

import automation.qa.ui.tasks.StartFlow;
import automation.qa.ui.user_interface.SearchResultPage;
import automation.qa.ui.user_interface.StaysPage;
import automation.qa.ui.dtos.StaysData;
import automation.qa.ui.questions.StaysQuestions;
import automation.qa.ui.tasks.StartFlow;
import automation.qa.ui.tasks.Stays;

import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class StaysSteps {


    @DataTableType
    public StaysData convertStays(Map<String, String> entry) {
        return new StaysData(
                entry.get("destino"));
    }

    @Managed public WebDriver hisBrowser;

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("Que {} es un usuario que ingresa a la aplicacion")
    public void customerBegin(String userName){
        hisBrowser.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        theActorCalled(userName).can(BrowseTheWeb.with(hisBrowser));
        theActorInTheSpotlight().attemptsTo(StartFlow.a("INICIO"));
    }

    @Cuando("Digita la informacion de la ciudad a visitar")
    public void customerEnterStaysData(List<StaysData> staysDataList) {
        theActorInTheSpotlight()
                .attemptsTo(
                        Stays.withStaysData(
                        staysDataList.get(0).goingTo));
    }

    @Entonces("El sistema le mostrara los resultados de la busqueda")
    public void customerSuccess() {
        WaitUntil.the(SearchResultPage.MESSAGE_TITTLE, isPresent()).forNoMoreThan(30).seconds();
        theActorInTheSpotlight()
                .should(seeThat(the(SearchResultPage.SEARCH_RESULT_BTN), WebElementStateMatchers.isVisible()));
        theActorInTheSpotlight()
                .should(
                        seeThat(
                                "Mensaje Busqueda",
                                StaysQuestions.title()));
    }
}
