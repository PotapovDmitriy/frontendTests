package com.example.tests;

import com.codeborne.selenide.testng.annotations.Report;
import com.example.BaseTest;
import com.example.steps.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


@Test
@Report
public class WikiMainFuncTest extends BaseTest {
    // it20-10
    @Test(groups = "regression")
    public void loginWithValidDAta() {
        LoginPageSteps loginPageSteps = new LoginPageSteps();
        loginPageSteps.openLoginPage();
        MainPageSteps mainPageSteps = new MainPageSteps();
        mainPageSteps.isOpened(loginPageSteps.logIn("Cucumber-9111", "test456123"));
    }

    @DataProvider(name = "search")
    public Object[][] createData1() {
        return new Object[][]{
                {"Languages of Russia"},
                {"Greece"},
        };
    }

    // it20-52
    @Test(groups = "regression", dataProvider = "search")
    public void search(String searchText) {
        MainPageSteps mainPageSteps = new MainPageSteps();
        mainPageSteps.openMainPage().checkSearchInputPlaceholderIsEmpty().searchFor(searchText);
        ArticlePageSteps articlePageSteps = new ArticlePageSteps();
        articlePageSteps.checkHeader(searchText);
    }

    // it20-52
    @Test(groups = "regression")
    public void logOut() {
        LoginPageSteps loginPageSteps = new LoginPageSteps();
        loginPageSteps.openLoginPage();
        MainPageSteps mainPageSteps = new MainPageSteps();
        mainPageSteps.isOpened(loginPageSteps.logIn("Cucumber-9111", "test456123"));
        LogOutPageSteps logOutPageSteps = mainPageSteps.logOut();
        logOutPageSteps.isLogOut();
    }


    @Test(groups = "regression")
    public void searchIncorrectData() {
        String searchText = "ASdasdasdasd";
        MainPageSteps mainPageSteps = new MainPageSteps();
        mainPageSteps.openMainPage().checkSearchInputPlaceholderIsEmpty().searchFor(searchText);
        SearchPageSteps searchPageSteps = new SearchPageSteps().openSearchPage();
        searchPageSteps.checkThatErrorsMassageContainsValue(searchText);
    }

    //it20-12
    @Test(groups = "regressionIncorrect")
    public void loginWithNonValidData() {
        LoginPageSteps loginPageSteps = new LoginPageSteps();
        loginPageSteps.openLoginPage();
        loginPageSteps.logIn("Cucumber-9111", "test4561");
        loginPageSteps.containsErrorsBlockWithText("Incorrect username or password entered.\nPlease try again.");
    }
}
