package com.example.pages;

import com.example.components.LoginPageItems;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends AbstractPage<LoginPage> {

    private LoginPageItems loginPageItems = new LoginPageItems();

    public LoginPage() {
        super();
        this.url = "https://en.wikipedia.org/w/index.php?title=Special:UserLogin&returnto=Main+Page";
    }

    public LoginPage navigate() {
        return super.navigate(this.getClass());
    }

    @Override
    public LoginPage waitPageLoaded() {
        $(".firstHeading").shouldHave(text("Log in"));
        return this;
    }

    public MainPage logIn() {
        loginPageItems.getButton().pressEnter();
        return new MainPage();
    }

    public LoginPage typePassword(String t) {
        loginPageItems.getPasswordField().setValue(t);
        return this;
    }

    public LoginPage typeLogin(String t) {
        loginPageItems.getUsernameField().setValue(t);
        return this;
    }

    public LoginPage containErrorsBlock(String descr) {
        loginPageItems.getErrorBox().shouldHave(text(descr));
        return this;
    }
}
