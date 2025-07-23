package Pages;

import Driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class IndexPage {
    private final By registerLinkIndexPageElement = By.linkText("Register");
    private final By userNameInputElement = By.cssSelector("input[name='username']");
    private final By passwordInputElement = By.cssSelector("input[name='password']");
    private final By loginButtonElement = By.cssSelector("input[value='Log In']");
    public void clickingRegisterLink(){
        Driver.getDriver().findElement(registerLinkIndexPageElement).click();
    }
    public void enterUserName(String userName){
        Driver.getDriver().findElement(userNameInputElement).sendKeys(userName);
    }
    public void enterPassword(String password){
        Driver.getDriver().findElement(passwordInputElement).sendKeys(password);
    }
    public void clickLoginButton(){
        Driver.getDriver().findElement(loginButtonElement).click();
    }
}