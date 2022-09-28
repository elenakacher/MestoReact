package com.telran.mestoreact.fw;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class FotoHelper extends HelperBase{

    public FotoHelper(WebDriver wd) {
        super(wd);
    }

    public void addFoto() {
        click(By.xpath("//button[@class = 'profile__add-button']"));

        pause(2000);
        type(By.xpath("//input[@placeholder = 'Name']"), "Rock");
        type(By.xpath("//input[@placeholder = 'Picture link']"), "https://images.unsplash.com/photo-1664339143798-fdb2dc74f5f0?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1074&q=80");
        click(By.xpath("//*[text() = 'Create']"));
    }

    public void clickLike() {
        click(By.xpath("//*[@class = 'place__stroke ']"));
        pause(2000);
    }

    public void deleteFoto() {
        pause(2000);
        click(By.xpath("//*[@class = 'place__trash place__trash_type_active']"));
        pause(2000);
        click(By.xpath("//*[text() = 'Yes']"));
    }

}
