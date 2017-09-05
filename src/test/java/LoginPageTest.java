import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginPageTest extends TestBase {
    @Test
    public void credentials() {
        LoginPage.login();
        String title = HomePage.pageLoad();
        Assert.assertEquals(title, "RMSys - Home");
    }
}
