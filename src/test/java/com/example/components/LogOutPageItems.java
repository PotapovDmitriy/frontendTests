package com.example.components;

import com.codeborne.selenide.ElementsContainer;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LogOutPageItems extends ElementsContainer {

    public SelenideElement getReturnBlock() {
        return $(getSelf().find("#mw-returnto"));
    }
    public SelenideElement getButton() {

        return $("#ooui-php-2 > button");
//        return $(By.xpath("/html/body/div[3]/div[3]/div[3]/div/form/div[2]/span/button"));
    }

    public SelenideElement getHeader() {

        return $("#firstHeading");
    }



}
