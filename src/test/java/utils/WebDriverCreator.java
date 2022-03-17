package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCreator {

    private static WebDriver driver;

    private WebDriverCreator() {
    }

    public static WebDriver getDriver() {
        if(driver == null) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }
}
