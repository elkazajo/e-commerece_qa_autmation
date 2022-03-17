package steps.common;

import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WebDriverCreator;

public class CommonSteps {
    WebDriver driver = WebDriverCreator.getDriver();

    @When("^'String' page should be displayed$")
    public void pageShouldBeDisplayed(String pageName) {
        driver.findElement(By.linkText(pageName));
    }
}
