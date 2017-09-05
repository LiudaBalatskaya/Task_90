import base.TestBaseEditor;
import org.testng.annotations.Test;

import static pages.EditorPage.checkText;
import static pages.EditorPage.enterText;

public class EditorTest extends TestBaseEditor {
    @Test
    public void checkEditor() {
        enterText();
        checkText();
    }
}
