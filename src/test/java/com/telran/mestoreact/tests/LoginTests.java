package com.telran.mestoreact.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {


    @BeforeMethod
    public void ensurePrecondition() {
        app.getHeaderHelper().pause(500);
        if (!app.getHeaderHelper().isRegisterLinkPresent()) {
            app.getHeaderHelper().clickOnLoginButton();
        }
    }

    @Test
    public void loginPositiveTest() {
        app.getUserHelper().login();
        Assert.assertTrue(app.getHeaderHelper().isElementPresent(By.className("header__email")));
    }


}
