package searchtutorial.duckduckgo.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import searchtutorial.duckduckgo.navigate.NavigateActions;
import searchtutorial.duckduckgo.search.SearchActions;
import searchtutorial.duckduckgo.search.SearchResultsQuestions;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.everyItem;

public class DuckDuckGoSearcher {

    private String actor;

    @Steps
    NavigateActions navigate;

    @Steps
    SearchActions search;

    @Steps
    SearchResultsQuestions searchResults;

    @Step("#actor starts on DuckDuckGo home page")
    public void is_on_the_duck_duck_go_homepage() {
        navigate.toTheDuckDuckGoHomePage();
    }
    @Step("#actor searches thing related to {0}")
    public void searches_by_keywork_for(String keyword) {
        search.byKeyword(keyword);
    }

    @Step("#actor should only results containing the word {0}")
    public void should_see_only_containing(String expectedTerms) {
        List<String> results = searchResults.displayed();

        assertThat(results, everyItem(containsString(expectedTerms)));
    }
}
