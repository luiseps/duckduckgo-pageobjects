package searchtutorial.duckduckgo;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import searchtutorial.steps.DuckDuckGoSearcher;

@RunWith(SerenityRunner.class)
public class WhenSearchingByKeywordInDuckDuckGo {

    @Steps
    DuckDuckGoSearcher sam;
    @Managed
    WebDriver driver;

    @Test
    public void should_see_relevant_search_results(){
        sam.is_on_the_duck_duck_go_homepage();

        sam.searches_by_keywork_for("Cucumber Recipies");

        sam.should_see_only_containing("Cucumber");
    }
}
