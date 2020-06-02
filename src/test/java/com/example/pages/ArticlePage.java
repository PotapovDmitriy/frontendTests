package com.example.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.example.constants.Constants.PAGE_LOAD_TIME;

public class ArticlePage extends AbstractPage<ArticlePage> {
    public ArticlePage() {
        super();
    }

    public ArticlePage navigate() {
        return super.navigate(this.getClass());
    }

    @Override
    public ArticlePage waitPageLoaded() {
        $(".result-list").waitUntil(visible, PAGE_LOAD_TIME);
        return this;
    }

    public SelenideElement getArticleName() {
        return $(".firstHeading");
    }


    public SelenideElement getSearchTypeElement(String text) {
        return $(byText(text));
    }

}
