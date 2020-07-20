package searchtutorial.steps;

import net.thucydides.core.annotations.Step;
import searchtutorial.pageobjects.DuckDuckGoResultPage;
import searchtutorial.pageobjects.DuckDuckGoSearchPage;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.everyItem;

public class DuckDuckGoSearcher {

    private String actor;
    DuckDuckGoSearchPage searchPage;
    DuckDuckGoResultPage resultPage;

    @Step("#actor searches thing related to {0}")
    public void searches_by_keywork_for(String keyword) {
        searchPage.enterSearchTerms(keyword);
        searchPage.submitSearch();
    }

    @Step("#actor should only results containing the word {0}")
    public void should_see_only_containing(String expectedTerms) {
        List<String> results = resultPage.getDisplayedResults();

        assertThat(results, everyItem(containsString(expectedTerms)));
    }

    @Step("#actor starts on DuckDuckGo home page")
    public void is_on_the_duck_duck_go_homepage() {
        searchPage.open();
    }
}
