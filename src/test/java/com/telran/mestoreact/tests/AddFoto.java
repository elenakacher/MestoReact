package com.telran.mestoreact.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddFoto extends TestBase{
    @BeforeMethod
    public void ensurePrecondition() {
        app.getHeaderHelper().pause(500);
        app.getUserHelper().login();
    }

    @Test
    public void addFotoPositiveTest() {
        app.getFotoHelper().addFoto();
        app.getFotoHelper().pause(2000);
        app.getFotoHelper().clickLike();
    }

    @AfterMethod
    public void tierDown() {
        app.getFotoHelper().deleteFoto();
    }
}
