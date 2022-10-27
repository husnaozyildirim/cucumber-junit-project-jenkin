package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class BaseWebpage {
    public BaseWebpage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
