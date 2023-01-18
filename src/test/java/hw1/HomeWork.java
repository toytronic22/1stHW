package hw1;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.commands.Find;
import com.codeborne.selenide.conditions.Text;
import org.junit.jupiter.api.Test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class HomeWork {
    @Test
    void searchSoftAssertions () {
    //Откройте страницу Selenide в Github
        open("https://github.com/selenide/selenide");
    // Перейдите в раздел Wiki проекта
        $("[data-tab-item=i5wiki-tab]").click();
    //Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        $(byText("Soft assertions")).click();
    //Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5
        $(byTagAndText("h4","3. Using JUnit5 extend test class:")).shouldBe(visible);
    }

}
