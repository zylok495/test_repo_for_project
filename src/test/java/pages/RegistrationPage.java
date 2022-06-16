package pages;

import base.DriverInit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.Driver;

public class RegistrationPage {

    public WebDriver driver;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/h3")
    public static WebElement header;

    public RegistrationPage() {
        driver = DriverInit.getDriver();
        PageFactory.initElements(driver, this);
    }

    public static WebElement getHeader() {
        return header;
    }
}
