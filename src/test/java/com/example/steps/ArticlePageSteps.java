package com.example.steps;

import com.codeborne.selenide.SelenideElement;
import com.example.pages.ArticlePage;

import static com.codeborne.selenide.Condition.empty;
import static com.codeborne.selenide.Condition.text;

public class ArticlePageSteps extends BaseSteps<ArticlePage>  {

    public ArticlePageSteps() {
        page = new ArticlePage();
    }

    public ArticlePageSteps openArticlePage() {
        page.navigate();
        return this;
    }

    public ArticlePageSteps checkHeader(String name) {
        SelenideElement header = page.getArticleName();
        header.shouldHave(text(name));
        return this;
    }
}
