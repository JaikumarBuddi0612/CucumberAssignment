package Pages;

import Driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterPage {
    private final By firstNameElement = By.cssSelector("input[name='customer.firstName']");
    private final By lastNameElement = By.cssSelector("input[name='customer.lastName']");
    private final By addressElement = By.cssSelector("input[name='customer.address.street']");
    private final By cityElement = By.cssSelector("input[name='customer.address.city']");
    private final By stateElement = By.cssSelector("input[name='customer.address.state']");
    private final By zipCodeElement = By.cssSelector("input[name='customer.address.zipCode']");
    private final By phoneNumberElement = By.cssSelector("input[name='customer.phoneNumber']");
    private final By ssnElement = By.cssSelector("input[name='customer.ssn']");
    private final By usernameElement = By.cssSelector("input[name='customer.username']");
    private final By passwordElement = By.cssSelector("input[name='customer.password']");
    private final By confirmPasswordElement = By.cssSelector("input[name='repeatedPassword']");
    private final By registerButtonElement = By.cssSelector("input[value='Register']");
    ChromeDriver driver = Driver.getDriver();

    public void enterFirstName(String firstName){
        driver.findElement(firstNameElement).sendKeys(firstName);
    }

    public void enterLastName(String lastName){
        driver.findElement(lastNameElement).sendKeys(lastName);
    }

    public void enterAddresElement(String address){
        driver.findElement(addressElement).sendKeys(address);
    }

    public void enterCity(String city){
        driver.findElement(cityElement).sendKeys(city);
    }

    public void enterState(String state){
        driver.findElement(stateElement).sendKeys(state);
    }

    public void enterZipcode(String zipCode){
        driver.findElement(zipCodeElement).sendKeys(zipCode);
    }

    public void enterPhoneNumber(String phoneNumber){
        driver.findElement(phoneNumberElement).sendKeys(phoneNumber);
    }

    public void enterSSN(String ssn){
        driver.findElement(ssnElement).sendKeys(ssn);
    }

    public void enterUsername(String userName){
        driver.findElement(usernameElement).sendKeys(userName);
    }

    public void enterPassword(String password){
        driver.findElement(passwordElement).sendKeys(password);
    }

    public void reneterPassword(String confirmPassword){
        driver.findElement(confirmPasswordElement).sendKeys(confirmPassword);
    }

    public void pressRegisterbutton(){
        driver.findElement(registerButtonElement).click();
    }
}
