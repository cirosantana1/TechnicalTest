package automation.qa.ui.user_interface;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CarsPage {
    public static final Target CARS_BTN = Target
            .the("Cars Button")
            .located(By.xpath("//body/div[@id='app']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/div[1]/div[1]/div[1]/div[1]/figure[1]/div[3]/div[1]/div[1]/ul[1]/li[3]/a[1]"));
    public static final Target DELIVERY = Target
            .the("Delivery")
            .located(By.xpath("//body/div[@id='app']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/div[1]/div[1]/div[1]/div[1]/figure[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]"));
    public static final Target DELIVERY01 = Target
            .the("Delivery01")
            .located(By.xpath("//input[@id='location-field-locn']"));
    public static final Target RETURN = Target
            .the("Return")
            .located(By.xpath("//body/div[@id='app']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/div[1]/div[1]/div[1]/div[1]/figure[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]"));
    public static final Target RETURN01 = Target
            .the("Return01")
            .located(By.xpath("//input[@id='location-field-loc2']"));
    public static final Target PICKUP_TIME = Target
            .the("PickUp Time")
            .located(By.xpath("//body/div[@id='app']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/div[1]/div[1]/div[1]/div[1]/figure[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/select[1]"));
    public static final Target DROPOFF_TIME = Target
            .the("DropOff Time")
            .located(By.xpath("//body/div[@id='app']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/div[1]/div[1]/div[1]/div[1]/figure[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/select[1]"));
    public static final Target SEARCH_BTN = Target
            .the("Search")
            .located(By.xpath("//button[contains(text(),'Search')]"));


}
