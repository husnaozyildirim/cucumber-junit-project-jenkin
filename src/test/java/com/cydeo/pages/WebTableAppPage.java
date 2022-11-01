package com.cydeo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class WebTableAppPage extends BasePage {

    @FindBy(name = "username")
    public WebElement usernameInput;

    @FindBy(name = "password")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginBtn;

    /**
     * this method will accept username and password and login to app
     *
     * @param username
     * @param password
     */
    public void loginWebTableApp(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }

    @FindBy(xpath = "//button[.='Order']")
    public WebElement orderModule;

    @FindBy(css = "select[name='product']")
    public WebElement productDropdown;

    @FindBy(css = "input[name='quantity']")
    public WebElement quantityInput;

    @FindBy(css = "input[placeholder='Enter the price for an individual unit']")
    public WebElement pricePerUnitInput;

    @FindBy (css = "input[name='name']")
    public WebElement customerNameInput;

    @FindBy (css = "input[name='street']")
    public WebElement streetInput ;

    @FindBy (css = "input[name='city']")
    public WebElement cityInput ;

    @FindBy (css = "input[name='state']")
    public WebElement stateInput ;

    @FindBy (css = "input[name='zip']")
    public WebElement zipInput;

    @FindBy (css = "input[name='card']")
    public List<WebElement> allCardType ;

    @FindBy (css = "input[name='cardNo']")
    public WebElement cardNoInput ;

    @FindBy (css = "input[name='cardExp']")
    public WebElement cardExpInput ;

    @FindBy (css = "button[type='submit']")
    public WebElement processOrderBtn ;

    @FindBy (xpath = "//table[@class='table is-fullwidth']/tbody/tr[1]/td[1]")
    public  WebElement nameFirstRow ;




}
