package pages.ss_home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class SsHomePage extends BasePage {

    public SsHomePage(WebDriver driver) {
        super(driver);
    }

    private final By estateType = By.xpath("//div[@data-title='ქონების ტიპი']");
    private final By flat = By.xpath("//label[@for='Flat']");
    private final By saveEstateTypeBtn = By.xpath("//button[@class='save']");
    private final By findBtn = By.xpath("//button[@id='search']");

    public SsHomePage enterFlats() {
        driver.findElement(estateType).click();
        WebElement flatBtn = driver.findElement(flat);
        //driver.findElement(flat).click();
        waitElementIsVisible(flatBtn).click();
        driver.findElement(saveEstateTypeBtn).click();
        return this;
    }

    public SsHomePage clickFind() {
        WebElement btnFind = driver.findElement(findBtn);
        waitElementIsVisible(btnFind).click();
        return this;
    }
}
