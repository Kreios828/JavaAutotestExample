package tests.searchapartment;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Constant.Urls.SS_HOME_PAGE;

public class SearchApartmentTest extends BaseTest {

    @Test
    public void showFlats() {
        basePage.open(SS_HOME_PAGE);

        ssHomePage.enterFlats().clickFind();
        ssListingPage.checkCountCards();
    }
}
