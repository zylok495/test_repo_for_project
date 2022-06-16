package steps;

import base.User;
import org.openqa.selenium.WebElement;

public class RegistrationInitiationStep {

    public void typeEmailAddress(WebElement element, String emailAddress) {
        element.sendKeys(emailAddress);
    }

}
