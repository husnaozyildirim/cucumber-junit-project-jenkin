package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EtsyPage extends BasePage {


@FindBy (name = "search_query")
    public WebElement searchBox;

@FindBy (css = "span[class='wt-icon wt-nudge-b-2 wt-nudge-r-1']")
public WebElement searchBtn;
}
