package com.telran.mestoreact.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderHelper extends HelperBase{

    public HeaderHelper(WebDriver wd) {
        super(wd);
    }

    public boolean isRegisterLinkPresent() {
        return isElementPresent(By.xpath("//a[contains(text(),'Register')]"));
    }

    public boolean isElementPresent(By locator) {
        return wd.findElements(locator).size()>0;
    }

    public void clickOnRegisterButton() {
        wd.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
    }

    public boolean isLoginLinkPresent() {
        return isElementPresent(By.xpath("//*[contains(text(),'Log in')]"));
    }

    public void clickOnLoginButton() {
        wd.findElement(By.xpath("//*[contains(text(),'Log in')]")).click();
    }

    public boolean isLogoutLinkPresent() {
        return isElementPresent(By.xpath("//*[contains(text(),'Log Out')]"));
    }

    public void clickOnLogoutButton() {
        wd.findElement(By.xpath("//*[contains(text(),'Log Out')]"));
    }
}
