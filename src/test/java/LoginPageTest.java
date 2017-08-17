import base.TestBase;
import org.testng.annotations.Test;


public class LoginPageTest extends TestBase {
    @Test
    public void credentials() {
        pages.LoginPage.login();
    }

}
