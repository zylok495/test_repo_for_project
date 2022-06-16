package stepdefinitions;

import base.User;
import base.Waiter;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.RegistrationPage;
import pages.SignInPage;

public class RegistrationInitiationStepDefinition {

    public User user;
    public SignInPage signInPage = new SignInPage();
    public RegistrationPage registrationPage= new RegistrationPage();

    @Given("a visitor")
    public void a_visitor() {
        this.user = new User();
    }

    @When("open the Sign in page")
    public void openTheSignInPage() {
        signInPage.openPage();
    }

    @When("type valid email address to the email address field")
    public void type_valid_email_address_to_the_email_address_field() {
        signInPage.typeEmailAddress(signInPage.getEmailAddressField(), user.getEmailAddress());
    }

    @When("click on Create an account button")
    public void click_on_create_an_account_button() {
        signInPage.clickOnElement(signInPage.getCreateAnAccountButton());
    }

    @Then("registration process is initiated")
    public void registration_process_is_initiated() {
        Waiter.waiter(registrationPage.getHeader(), signInPage.getDriver());
        Assert.assertEquals("YOUR PERSONAL INFORMATION", RegistrationPage.getHeader().getText());
    }


}
