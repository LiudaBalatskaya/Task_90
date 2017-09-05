import base.TestBaseAlert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import pages.AlertPage;

public class AlertPageTest extends TestBaseAlert {
    @Test
    public void checkJSAlert() {
        AlertPage.checkJSAlert();
        String result = AlertPage.verifyResult();
        AssertJUnit.assertEquals(result, "You successfuly clicked an alert");
    }

    @Test
    public void checkJSConfirm() {
        AlertPage.checkJSConfirm();
        String result = AlertPage.verifyResult();
        AssertJUnit.assertEquals(result, "You clicked: Ok");
    }

    @Test
    public void checkJSPrompt() {
        AlertPage.checkJSPrompt();
        String result = AlertPage.verifyResult();
        AssertJUnit.assertEquals(result, "You entered:");
    }

}
