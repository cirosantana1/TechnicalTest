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
}
