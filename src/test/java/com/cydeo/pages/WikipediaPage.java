package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WikipediaPage extends BaseWebpage {

    @FindBy(id = "searchInput")
    public WebElement searchInput;

    @FindBy(css = "button[type='submit']")
    public WebElement searchBtn;

    @FindBy (css = "span[class='mw-page-title-main']")
    public WebElement head;

    @FindBy (xpath = "//th[@class='infobox-above']//div[@class='fn']")
    public WebElement imgHeader ;
}
