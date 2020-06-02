package com.example.steps;

import com.codeborne.selenide.SelenideElement;
import com.example.pages.LoginPage;
import com.example.pages.MainPage;

import static com.codeborne.selenide.Condition.empty;

public class LoginPageSteps extends BaseSteps <LoginPage> {

    public LoginPageSteps() {
        page = new LoginPage();
    }

    public LoginPageSteps openLoginPage() {
        page.navigate();
        return this;
    }

    public MainPage logIn(String userName, String pass ) {
        page.typeLogin(userName);
        page.typePassword(pass);
        page.logIn();
        return new MainPage();
    }

    public LoginPageSteps containsErrorsBlockWithText(String text) {
        page.containErrorsBlock(text);
        return this;
    }


}
