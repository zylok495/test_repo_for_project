package base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInit {

    public static WebDriver driver;

    @Before
    public void initDriver() {
        driver = new ChromeDriver();
    }

    @After
    public void closeDriver() {
        if(!(driver == null)) {
            driver.quit();
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
