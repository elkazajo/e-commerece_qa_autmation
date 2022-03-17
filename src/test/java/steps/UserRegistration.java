package steps;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import page_objects.MainPage;
import utils.WebDriverCreator;

public class UserRegistration{

    MainPage mainPage = new MainPage();

    @Given("I open main page")
    public void iOpenMainPage() {
        mainPage.navigateTo();
    }
}
