package com.example.steps;

import com.example.pages.LogOutPage;
import com.example.pages.LoginPage;
import com.example.pages.MainPage;

public class LogOutPageSteps  extends BaseSteps <LogOutPage>  {

    public LogOutPageSteps() {
        page = new LogOutPage();
    }

    public LogOutPageSteps openLogOutPage() {
        page.navigate();
        return this;
    }

    public LogOutPageSteps isLogOut() {
        page.logOut().waitPageLoaded();
        return this;
    }

//    public LoginPageSteps containsErrorsBlockWithText(String text) {
//        page.containErrorsBlock(text);
//        return this;
//    }

}
