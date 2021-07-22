package automation.qa.ui.user_interface;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

@NoArgsConstructor(access = AccessLevel.PRIVATE)

public class SearchResultPage {
    public static final Target MESSAGE_TITTLE = Target
            .the("Message")
            .located(By.xpath("//legend[contains(text(),'Search by property name')]"));
    public static final Target SEARCH_RESULT_BTN = Target
            .the("Search Result")
            .located(By.xpath("//button[contains(text(),'Search')]"));
    public static final Target HOTEL_RESULT = Target
            .the("Hotel")
            .located(By.xpath("//body/div[@id='app']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/main[1]/div[1]/div[1]/div[1]/section[1]/div[2]/div[1]/div[2]/section[2]/ol[1]/li[1]/div[1]/a[1]"));
    public static final Target HOTEL_RESULT_BTN = Target
            .the("Hotel")
            .located(By.xpath("//button[contains(text(),'Reservar habitación')]"));
}
