import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;


public class HomePageTest extends TestBase {

    @AfterMethod
    public void quit() {
        LoginPage.quit();
    }

    @Test
    public void verifyLoadedPage() {
        LoginPage.login();
        HomePage.pageLoad();
    }

    @Test
    public void toOfficeTab() {
        LoginPage.login();
        HomePage.pageLoad();
        HomePage.tableOfficeName();
        HomePage.officeLayouts();
        Assert.assertTrue(HomePage.office118());
    }

}
