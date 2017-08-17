import base.TestBaseAlert;
import org.testng.annotations.Test;
import pages.AlertPage;

public class AlertPageTest extends TestBaseAlert {
    @Test
    public void checkJSAlert() {
        AlertPage.checkJSAlert();
    }

    @Test
    public void checkJSConfirm() {
        AlertPage.checkJSConfirm();
    }

    @Test
    public void checkJSPrompt() {
        AlertPage.checkJSConfirm();
    }

}
