package Pages;

import Driver.Driver;
import org.openqa.selenium.By;

public class IndexPage {
    private final By registerLinkIndexPageElement = By.linkText("Register");
    public void clickingRegisterLink(){
        Driver.getDriver().findElement(registerLinkIndexPageElement).click();
    }
}