package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class EditorPage {

    public static String framename = "mce_0_ifr";
    public static final By ENTER_AREA = By.id("tinymce");

    public static void enterText() {
        switchTo().frame(framename);
        $(ENTER_AREA).sendKeys("Hello world!");
    }

    public static void checkText() {
        $(ENTER_AREA).shouldHave(text("Hello world!"));
    }

}
