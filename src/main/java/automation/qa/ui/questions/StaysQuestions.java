package automation.qa.ui.questions;

import automation.qa.ui.user_interface.SearchResultPage;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class StaysQuestions {

    public static Question<String> title() {
        return actor -> Text.of(SearchResultPage.MESSAGE_TITTLE)
                .viewedBy(actor).asString();
    }
}
