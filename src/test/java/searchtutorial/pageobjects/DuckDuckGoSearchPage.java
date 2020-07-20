package searchtutorial.pageobjects;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl(("https://duckduckgo.com"))
public class DuckDuckGoSearchPage  extends PageObject {

    public static final String INPUT_HOMEPAGE = "#search_form_input_homepage";
   
    @FindBy(id = "search_button_homepage")
    WebElementFacade searchButton;

    public void enterSearchTerms(String keyword) {
        $(INPUT_HOMEPAGE).type(keyword);
    }

    public void submitSearch() {
        searchButton.click();
    }
}
