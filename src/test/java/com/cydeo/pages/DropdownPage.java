package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DropdownPage extends BasePage {

    @FindBy (id = "month")
    public WebElement monthsDropdown ;
}
