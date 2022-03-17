package page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePage;

public class MainPage extends BasePage {

    @FindBy (xpath = "//a[contains(text(),'Sign in')]")
    private WebElement signInButton;

    private String URL = "http://automationpractice.com/index.php";

    public MainPage() {
        super();
    }

    public void navigateTo(){
        openPage(URL);
    }

    public void clickSignInButton() {
        signInButton.click();
    }

}
