package com.example.components;

import com.codeborne.selenide.ElementsContainer;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPageItems extends ElementsContainer {
    public SelenideElement getUsernameField() {
        return $(By.name("wpName"));
    }

    public SelenideElement getPasswordField() {
        return $(By.name("wpPassword"));
    }

    public SelenideElement getButton() {
        return $(By.name("wploginattempt"));
    }


    public SelenideElement getErrorBox() {
        return $(By.className("errorbox"));
    }
}
