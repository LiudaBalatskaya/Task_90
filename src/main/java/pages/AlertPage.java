package pages;

import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.confirm;

public class AlertPage {

    public static void checkJSAlert() {
        WebElement button = $(byText("Click for JS Alert"));
        $(button).click();
        confirm("I am a JS Alert");
    }

    public static void checkJSConfirm() {
        WebElement button = $(byText("Click for JS Confirm"));
        $(button).click();
        confirm("I am a JS Confirm");
    }

    public static void checkJSPrompt() {
        WebElement button = $(byText("Click for JS Prompt"));
        $(button).click();
        confirm("I am a JS prompt");
    }

}
