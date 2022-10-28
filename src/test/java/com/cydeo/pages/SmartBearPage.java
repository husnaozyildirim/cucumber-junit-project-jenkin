package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SmartBearPage extends BaseWebpage {
    @FindBy(id = "ctl00_MainContent_username")
    public WebElement usernameInput;

    @FindBy(id = "ctl00_MainContent_password")
    public WebElement passwordInput;

    @FindBy(id = "ctl00_MainContent_login_button")
    public WebElement loginBtn;
    @FindBy(linkText = "Order")
    public WebElement orderModule;

    @FindBy(id = "ctl00_MainContent_fmwOrder_ddlProduct")
    public WebElement productSelect;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtQuantity")
    public WebElement quantity;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtName")
    public WebElement customerName;

    @FindBy (id = "ctl00_MainContent_fmwOrder_TextBox2")
    public WebElement street ;

    @FindBy (id = "ctl00_MainContent_fmwOrder_TextBox3")
    public WebElement city ;

    @FindBy (id = "ctl00_MainContent_fmwOrder_TextBox4")
    public WebElement state;

    @FindBy (id = "ctl00_MainContent_fmwOrder_TextBox5")
    public WebElement zip;

    @FindBy (id = "ctl00_MainContent_fmwOrder_cardList_0")
    public WebElement visaRadioBtn ;

    @FindBy (id = "ctl00_MainContent_fmwOrder_TextBox6")
    public WebElement cardNr;

    @FindBy (id = "ctl00_MainContent_fmwOrder_TextBox1")
    public WebElement expireDate ;

    @FindBy (id = "ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement processBtn ;

    @FindBy (linkText = "View all orders")
    public WebElement viewAllOrders;







}
