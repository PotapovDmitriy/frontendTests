package com.example.steps;

import com.codeborne.selenide.SelenideElement;
import com.example.pages.MainPage;
import com.example.pages.SearchPage;

import static com.codeborne.selenide.Condition.empty;

public class SearchPageSteps extends  BaseSteps<SearchPage> {

    public SearchPageSteps openSearchPage() {
        page = new SearchPage();
        return this;
    }

    public SearchPageSteps checkThatErrorsMassageContainsValue(String value) {
//        page.getSearchErrorMessage();
        page.getErrorsMessage(value);
        return this;
    }
}
