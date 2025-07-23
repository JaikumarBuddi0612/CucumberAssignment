package Pages;

import Driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OverViewPage {
    private final By billPayLinkElement = By.linkText("Bill Pay");
    public void clickBillPayLink(){
//        Driver.getDriver().switchTo().alert().accept();
        Driver.getDriver().findElement(billPayLinkElement).click();
    }
}
