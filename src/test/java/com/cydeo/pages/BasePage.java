package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriverPool(),this);
    }

        @FindBy(css = ".active")
        public WebElement viewAllOrders;

        @FindBy(css = "a[href='/products'] button")
        public WebElement viewAllProducts;

        @FindBy(css = "a[href='/create-order'] button")
        public WebElement order;

        @FindBy(css = ".__logout")
        public WebElement logoutButton;


    }


