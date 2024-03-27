import Pages.TheInternetPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TheInternetTest extends BaseTest {

    @Test
    public void isHeaderTextEqualToExpected() {
        getDriver().get("https://the-internet.herokuapp.com/");
        TheInternetPage theInternetPage = PageFactory.initElements(getDriver(), TheInternetPage.class);
        String headerText = theInternetPage.headerText();
        Assert.assertEquals(headerText, "Welcome to the-internet");
    }

}
