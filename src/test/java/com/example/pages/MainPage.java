package com.example.pages;

import com.codeborne.selenide.SelenideElement;
import com.example.components.MainPageItems;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;


public class MainPage extends AbstractPage<MainPage> {

    MainPageItems item  = new MainPageItems();

    public MainPage() {
        super();
        this.url = "https://en.wikipedia.org/wiki/Main_Page";
    }

    public MainPage navigate() {
        return super.navigate(this.getClass());
    }

    @Override
    public MainPage waitPageLoaded() {
        $("#mp-welcome").shouldHave(text("Welcome to "));
        return this;
    }

    public LogOutPage logOutHref() {
        return new LogOutPage().navigate().waitPageLoaded();
    }


    public SelenideElement getSearchField() {

        return item.getSearchField();
    }

    public void search(String t ) {
        getSearchField().setValue(t).pressEnter();
    }

    public SelenideElement getSearchButton() {
        return $("input[type=submit]");
    }
}
