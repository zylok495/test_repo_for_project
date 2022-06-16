package pages;

import base.DriverInit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

    public WebDriver driver = DriverInit.getDriver();
    @FindBy(css = "#email_create")
    public WebElement emailAddressField;
    @FindBy(css = "#SubmitCreate")
    public WebElement createAnAccountButton;

    public SignInPage() {
        PageFactory.initElements(driver, this);
    }

    public void openPage() {
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

    public void typeEmailAddress(WebElement element, String emailAddress) {
        element.sendKeys(emailAddress);
    }

    public void clickOnElement(WebElement element) {
        element.click();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebElement getEmailAddressField() {
        return emailAddressField;
    }

    public WebElement getCreateAnAccountButton() {
        return createAnAccountButton;
    }
}
