import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            initializeDriver();
        }
        return driver;
    }

    @BeforeClass
    public static void initializeDriver() {

        ChromeOptions options = new ChromeOptions();
        options.setCapability("browserName", "chrome");
        try {
            URL hubUrl = new URL("http://selenium:4444/wd/hub");
            driver = new RemoteWebDriver(hubUrl, options);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @AfterClass
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}

//    private static WebDriver driver;
//    public static WebDriver getDriver(){
//        if (driver == null){
//            initializeDriver();
//
//        }
//        return driver;
//    }
//
//    @BeforeClass
//    public static void initializeDriver(){
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//    }
//
//    @AfterClass
//    public static void quitDriver(){
//        if (driver != null){
//            driver.quit();
//        }
//    }
//