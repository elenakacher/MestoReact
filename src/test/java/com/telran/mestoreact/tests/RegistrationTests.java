package com.telran.mestoreact.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTests extends TestBase{

    @BeforeMethod
    public void ensurePrecondition(){
        app.getHeaderHelper().pause(1000);
        if (app.getHeaderHelper().isRegisterLinkPresent()){
            app.getHeaderHelper().clickOnRegisterButton();
        }
    }

    @Test
    public void registrationPositiveTest(){
        app.getUserHelper().registration();

        app.getHeaderHelper().pause(4000);
        Assert.assertTrue(app.getHeaderHelper().isElementPresent(By.xpath("//button[contains(text(),'Log in')]")));

    }
}
