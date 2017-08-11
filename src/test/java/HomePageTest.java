import base.TestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pages.LoginPage;


public class HomePageTest extends TestBase{

    @AfterMethod
    public void quit(){
        LoginPage.quit();
    }

    @Test
    public void verifyLoadedPage(){
        pages.LoginPage.login();
        pages.HomePage.pageLoad();
    }

    @Test
    public void toOfficeTab(){
        pages.LoginPage.login();
        pages.HomePage.pageLoad();
        pages.HomePage.tableOfficeName();
        pages.HomePage.officeLayouts();
    }

}
