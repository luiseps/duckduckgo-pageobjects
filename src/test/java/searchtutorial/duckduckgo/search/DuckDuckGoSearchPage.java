package searchtutorial.duckduckgo.search;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl(("https://duckduckgo.com"))
public class DuckDuckGoSearchPage  extends PageObject {
    public static final String HOMEPAGE_INPUNT_FIELD = "#search_form_input_homepage";
    public static final String SEARCH_BUTTON = "#search_button_homepage";
}
