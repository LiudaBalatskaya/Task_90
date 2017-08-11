package base;

import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.Selenide.open;

public class TestBaseEditor {

    protected static final String FRAME_URL = "https://the-internet.herokuapp.com/iframe";

    @BeforeClass
    public static void setup() {
        open(FRAME_URL);
    }
}
