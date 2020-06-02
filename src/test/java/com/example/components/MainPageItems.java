package com.example.components;

import com.codeborne.selenide.ElementsContainer;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MainPageItems extends ElementsContainer {
    public SelenideElement getSearchField() {
        return $("input#searchInput");
    }

    public SelenideElement getTextElement() {
        return getSelf().find(".text");
    }

    public SelenideElement getLogOutHref() {
        return getSelf().find("li#pt-logout");
    }
}
