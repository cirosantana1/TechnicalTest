package automation.qa.ui.user_interface;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

@NoArgsConstructor(access = AccessLevel.PRIVATE)

public class CarsResultPage {
    public static final Target MESSAGE_COVID = Target
            .the("MessageCovid")
            .located(By.xpath("//p[contains(text(),'Alerta sobre el COVID-19: los requisitos para viaj')]"));
    public static final Target OrderBy = Target
            .the("OrderBy")
            .located(By.xpath("//select[@id='cars-sort-dropdown']"));
}
