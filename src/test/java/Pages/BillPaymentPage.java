package Pages;

import Driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BillPaymentPage {

    private final By payeeNameElement = By.cssSelector("input[name='payee.name']");
    private final By payeeAddressElement = By.cssSelector("input[name='payee.address.street']");
    private final By payeeCityElement = By.cssSelector("input[name='payee.address.city']");
    private final By payeeStateElement = By.cssSelector("input[name='payee.address.state']");
    private final By payeeZipCodeElement = By.cssSelector("input[name='payee.address.zipCode']");
    private final By payeePhoneNumberElement = By.cssSelector("input[name='payee.phoneNumber']");
    private final By accountElement = By.cssSelector("input[name='payee.accountNumber']"); // fixed typo here
    private final By verifyAccountElement = By.cssSelector("input[name='verifyAccount']");
    private final By amountElement = By.cssSelector("input[name='amount']");
    private final By sendPaymentButtonElement = By.cssSelector("input[value='Send Payment']");
    private final By successPayment = By.cssSelector("div#billpayResult");
    private final By logoutElement = By.linkText("Log Out");

    public void enterPayeeName(String payeeName) {
        Driver.getDriver().findElement(payeeNameElement).sendKeys(payeeName);
    }

    public void enterAddress(String address) {
        Driver.getDriver().findElement(payeeAddressElement).sendKeys(address);
    }

    public void enterCity(String city) {
        Driver.getDriver().findElement(payeeCityElement).sendKeys(city);
    }

    public void enterState(String state) {
        Driver.getDriver().findElement(payeeStateElement).sendKeys(state);
    }

    public void enterZipCode(String zipCode) {
        Driver.getDriver().findElement(payeeZipCodeElement).sendKeys(zipCode);
    }

    public void enterPhoneNumber(String phoneNumber) {
        Driver.getDriver().findElement(payeePhoneNumberElement).sendKeys(phoneNumber);
    }

    public void enterAccountNumber(String accountNumber) {
        Driver.getDriver().findElement(accountElement).sendKeys(accountNumber);
    }

    public void enterVerifyAccount(String verifyAccount) {
        Driver.getDriver().findElement(verifyAccountElement).sendKeys(verifyAccount);
    }

    public void enterAmount(String amount) {
        Driver.getDriver().findElement(amountElement).sendKeys(amount);
    }

    public void clickSendPaymentButton() {
        Driver.getDriver().findElement(sendPaymentButtonElement).click();
    }
    public boolean isSuccess(){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(3));
        WebElement element = Driver.getDriver().findElement(successPayment);

        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public String successMessage(){
        if(isSuccess()){
            return Driver.getDriver().findElement(successPayment).getText();
        }
        return null;
    }
    public void logoutUser(){
        Driver.getDriver().findElement(logoutElement).click();
    }
}
