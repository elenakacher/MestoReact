package com.telran.mestoreact.fw;

import com.telran.mestoreact.models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends HelperBase{
    public UserHelper(WebDriver wd) {
        super(wd);
    }


    public void registration() {
        fillLoginRegistrationForm(new User().setEmail("a@gmail.com").setPassword("12345"));
        // click on the button Registration
        click(By.xpath("//button[contains(text(),'Register')]"));
    }

    public void login() {
        fillLoginRegistrationForm(new User().setEmail("a@gmail.com").setPassword("12345"));
        // click on the button Login
        click(By.xpath("//button[contains(text(),'Log in')]"));
    }

    public void fillLoginRegistrationForm(User user) {
        type(By.cssSelector("[placeholder='Email']"), user.getEmail());
        type(By.cssSelector("[placeholder='Password']"), user.getPassword());
    }

    public void logout() {
        click(By.xpath("//*[contains(text(),'Log out')]"));
    }

}
