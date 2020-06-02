package com.example.steps;

import com.codeborne.selenide.SelenideElement;
import com.example.pages.MainPage;

import static com.codeborne.selenide.Condition.attributeMatching;
import static com.codeborne.selenide.Condition.empty;

public class MainPageSteps extends BaseSteps<MainPage> {
    public MainPageSteps() {
        page = new MainPage();
    }

    public MainPageSteps openMainPage() {
        page.navigate();
        return this;
    }

    public MainPageSteps checkSearchInputPlaceholderIsEmpty() {
        SelenideElement searchField = page.getSearchField();
        searchField.should(empty);
        return this;
    }

    public MainPageSteps searchFor(String searchText) {
        SelenideElement searchField = page.getSearchField();
        searchField.setValue(searchText);
        searchField.pressEnter();
        return this;
    }

    public MainPageSteps isOpened(MainPage main) {
        main.shouldBeOpened();
        return this;
    }

    public LogOutPageSteps logOut() {
        return new LogOutPageSteps().openLogOutPage();
    }

}
