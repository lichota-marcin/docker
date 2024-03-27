package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TheInternetPage {

    final WebDriver driver;

    //Constructor, as every page needs a Webdriver to find elements
    public TheInternetPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//h1[@class='heading']")
    WebElement header;

    public String headerText() {
        return header.getText().trim();
    }

}
