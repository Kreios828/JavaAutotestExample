package pages.listing;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.base.BasePage;

public class SsListingPage extends BasePage {

    public SsListingPage(WebDriver driver) {
        super(driver);
    }

    private final By card = By.xpath("//div[@class='DesktopArticleLayout']");

    public SsListingPage checkCountCards() {
        int countCard = driver.findElements(card).size();
        Assert.assertEquals(20, countCard);
        return this;
    }
}
