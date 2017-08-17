package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    private static final By OFFICE = By.id("officeWidgetContent");
    private static final By ROWS = By.cssSelector(".widgetSelectableRow");

    public static void pageLoad() {
        $(byText("RMSys - Home"));
    }

    public static void tableOfficeName() {
        $(byText("Office Layouts"));
    }

    public static void officeLayouts() {
        WebElement table = $(OFFICE);
        $(table).$(ROWS).shouldBe(visible);

    }
}

