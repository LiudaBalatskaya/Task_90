package base;


import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.Selenide.open;

public class TestBaseAlert {
    protected static final String ALERT_URL = "https://the-internet.herokuapp.com/javascript_alerts";

    @BeforeClass
    public static void setup() {
        open(ALERT_URL);
    }
}
