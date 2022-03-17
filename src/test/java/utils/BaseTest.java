package utils;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    private WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        driver = WebDriverCreator.getDriver();
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }
}
