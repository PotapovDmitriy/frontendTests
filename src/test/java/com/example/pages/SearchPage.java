package com.example.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.example.constants.Constants.PAGE_LOAD_TIME;

public class SearchPage extends AbstractPage<SearchPage> {

    public SearchPage() {
        super();
//        this.url = "https://en.wikipedia.org/w/index.php?cirrusUserTesting=control&sort=relevance&search=&title=Special:Search&profile=advanced&fulltext=1&advancedSearch-current=%7B%7D&ns0=1";
    }

    public SearchPage navigate() {
        return super.navigate(this.getClass());
    }

    @Override
    public SearchPage waitPageLoaded() {
        $(".result-list").waitUntil(visible, PAGE_LOAD_TIME);
        return this;
    }

    public SelenideElement getSearchErrorMessage() {

        return $(By.className("new"));
//                "/html/body/div[3]/div[3]/div[3]/div[2]/form/div[1]/div/div/div/div/div/input");
    }


    public SelenideElement getErrorsMessage(String expectedValue) {
        return getSearchErrorMessage().shouldHave(text(expectedValue));
    }

}
