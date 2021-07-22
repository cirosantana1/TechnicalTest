package automation.qa.ui.user_interface;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class StaysPage {

    public static final Target STAYS_TITTLE = Target
            .the("Stays")
            .located(By.xpath("//span[contains(text(),'Stays')]"));
    public static final Target GOING_TO = Target
            .the("Going To")
            .located(By.xpath("//body/div[@id='app']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/div[1]/div[1]/div[2]/div[1]/figure[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]"));
    public static final Target GOING_TO1 = Target
            .the("Going To")
            .located(By.xpath("//input[@id='location-field-destination']"));
    public static final Target MESSAGE_ERROR = Target
            .the("MessageError")
            .located(By.xpath("//h3[contains(text(),'To continue, please correct the error below.')]"));
    public static final Target SEARCH_BTN = Target
            .the("Search")
            .located(By.xpath("//button[contains(text(),'Search')]"));

}
