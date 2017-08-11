package base;


import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    protected static final String BASE_URL = "https://192.168.100.26/";


    @BeforeClass
    public static void setup() {
        open(BASE_URL);
    }
}
