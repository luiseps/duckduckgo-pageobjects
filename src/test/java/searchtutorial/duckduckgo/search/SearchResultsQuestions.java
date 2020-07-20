package searchtutorial.duckduckgo.search;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractionSteps;

import java.util.List;
import java.util.stream.Collectors;

import static searchtutorial.duckduckgo.search.DuckDuckGoResultPage.RESULT_TITLE;

public class SearchResultsQuestions extends UIInteractionSteps {

    public List<String> displayed() {
        return findAll(RESULT_TITLE)
                .stream()
                .map(WebElementFacade::getTextContent)
                .collect(Collectors.toList());
    }
}
