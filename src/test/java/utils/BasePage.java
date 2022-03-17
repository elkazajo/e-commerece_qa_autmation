package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {

    public WebDriver driver;
    private WebDriverWait webDriverWait;
    private static final int WAIT = 2000;

    public BasePage() {
        this.driver = WebDriverCreator.getDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofMillis(WAIT));
        PageFactory.initElements(this.driver, this);
    }

    protected void openPage(String url) {
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(WAIT));
        driver.manage().window().maximize();
    }

    protected void waitForElementToAppear(By locator) {
        webDriverWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }

    protected void waitForElementToDisappear(By locator) {
        webDriverWait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    protected void waitForTextToDisappear(By locator, String text) {
        webDriverWait.until(ExpectedConditions.not(ExpectedConditions.textToBe(locator, text)));
    }


}
