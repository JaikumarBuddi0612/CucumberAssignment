package StepDefinitions;

import Driver.Driver;
import Pages.IndexPage;
import Pages.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterUserStepDef {
    ChromeDriver driver= Driver.getDriver();
    IndexPage indexPage = new IndexPage();
    RegisterPage registerPage = new RegisterPage();
    @Given("User is on the Para Bank website")
    public void user_is_on_the_para_bank_website() {
        driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
    }
    @When("User clicks the register link")
    public void user_clicks_the_register_link() {
        indexPage.clickingRegisterLink();
    }
    @When("User is redirected to the registration page")
    public void user_is_redirected_to_the_registration_page() {
        System.out.println(driver.getTitle());
    }
    @When("User enters their first name{string}")
    public void user_enters_their_first_name(String firstName) {
        registerPage.enterFirstName(firstName);
    }
    @When("User enters their last name{string}")
    public void user_enters_their_last_name(String lastName) {
        registerPage.enterLastName(lastName);
    }
    @When("User enters their address{string}")
    public void user_enters_their_address(String address) {
        registerPage.enterAddresElement(address);
    }
    @When("User enters their city{string}")
    public void user_enters_their_city(String city) {
        registerPage.enterCity(city);
    }
    @When("User enters their state{string}")
    public void user_enters_their_state(String state) {
        registerPage.enterState(state);
    }
    @When("User enters their zipcode{string}")
    public void user_enters_their_zipcode(String zipCode) {
        registerPage.enterZipcode(zipCode);
    }
    @When("User enters their phone number{string}")
    public void user_enters_their_phone_number(String phoneNumber) {
        registerPage.enterPhoneNumber(phoneNumber);
    }
    @When("User enters their ssn{string}")
    public void user_enters_their_ssn(String ssn) {
        registerPage.enterSSN(ssn);
    }
    @When("User enters their username{string}")
    public void user_enters_their_username(String userName) {
        registerPage.enterUsername(userName);
    }
    @When("User enters their password{string}")
    public void user_enters_their_password(String password) {
        registerPage.enterPassword(password);
    }
    @When("User confirms their password{string}")
    public void user_confirms_their_password(String confirmPassword) {
        registerPage.reneterPassword(confirmPassword);
    }
    @When("User clicks the register button")
    public void user_clicks_the_register_button() {
        registerPage.pressRegisterbutton();
    }
    @Then("User is redirected to their profile")
    public void user_is_redirected_to_their_account_page() {
        System.out.println(driver.getTitle());
        driver.close();
    }
}
