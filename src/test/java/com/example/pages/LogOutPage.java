package com.example.pages;

import com.codeborne.selenide.SelenideElement;
import com.example.components.LogOutPageItems;
import com.example.components.MainPageItems;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class LogOutPage extends AbstractPage<LogOutPage> {


    LogOutPageItems item = new LogOutPageItems();

    public LogOutPage() {
        super();
        this.url = "https://en.wikipedia.org/w/index.php?title=Special:UserLogout&returnto=Main+Page";
    }

    public LogOutPage navigate() {
        return super.navigate(this.getClass());
    }

    @Override
    public LogOutPage waitPageLoaded() {

        item.getHeader().shouldHave(text("Log out"));
        return this;
    }



    public LogOutPage logOut() {
        SelenideElement but = item.getButton();
        but.click();
//        $(By.className("oo-ui-inputWidget-input oo-ui-buttonElement-button")).click();
        return this;
    }


}
