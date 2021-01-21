package org.mytests.uiobjects.example.site.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import io.qameta.allure.Step;
import org.testng.Assert;

@Url("/index.html") @Title("Home Page")
public class HomePage extends WebPage {

    @Step("Бросаем ошибку")
    public void throw_exception_step() {
        Assert.fail("Текст ошибки");
    }
}
