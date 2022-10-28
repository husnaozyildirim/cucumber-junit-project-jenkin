package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SmartBearLoginPage extends BaseWebpage {
    @FindBy (id = "ctl00_MainContent_username")
    public WebElement usernameInput ;

    @FindBy (id = "ctl00_MainContent_password")
    public WebElement passwordInput ;

    @FindBy (id = "ctl00_MainContent_login_button")
    public WebElement loginBtn ;
}
