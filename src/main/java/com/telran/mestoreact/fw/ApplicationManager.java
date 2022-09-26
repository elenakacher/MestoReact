package com.telran.mestoreact.fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    WebDriver wd;
    HeaderHelper headerHelper;
    UserHelper userHelper;

    public UserHelper getUserHelper() {
        return userHelper;
    }

    public HeaderHelper getHeaderHelper() {
        return headerHelper;
    }

    public void init(){
        wd = new ChromeDriver();
        wd.get("https://mesto.om.nomoredomains.xyz");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        headerHelper = new HeaderHelper(wd);
        userHelper = new UserHelper(wd);

    }


    public void stop() {
        wd.quit();
    }
}
