package com.telran.mestoreact.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogoutTests extends TestBase{

    @BeforeMethod
    public void ensurePrecondition() {
        app.getHeaderHelper().pause(500);
        if (!app.getHeaderHelper().isLogoutLinkPresent()) {
            app.getUserHelper().login();
        }
    }

    @Test
    public void logoutPositiveTest() {
        app.getHeaderHelper().pause(1000);
        app.getUserHelper().logout();
        Assert.assertTrue(app.getHeaderHelper().isElementPresent(By.xpath("//h2[contains(text(),'Log in')]")));
    }

}
