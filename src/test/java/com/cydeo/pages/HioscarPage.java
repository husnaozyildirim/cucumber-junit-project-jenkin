package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HioscarPage extends BasePage{

    @FindBy (xpath = "//div[@class='Button_content__yNdi7']/span[.='Search network']")
    public WebElement searchNetworkBtn ;

    @FindBy(xpath = "(//div[@class='fieldMessages_field__hR-R1'])[1]")
    public  WebElement coverageYear ;

    @FindBy (xpath = "//li[@class='DropdownOverlayItem_unselectable__Pa5zw']")
    public List<WebElement> coverageYearOptions;

    @FindBy (xpath = "(//div[@class='fieldMessages_field__hR-R1'])[2]")
    public WebElement coverageAccess ;

    @FindBy (xpath = "//li[@class='DropdownOverlayItem_unselectable__Pa5zw']/div")
    public List<WebElement> accessOptions ;

    @FindBy (xpath = "(//div[@class='fieldMessages_field__hR-R1'])[3]")
    public WebElement networkPartner ;

    @FindBy (xpath = "//li[@class='DropdownOverlayItem_unselectable__Pa5zw']/div")
public List<WebElement> networkPartnerOption ;


    @FindBy (xpath = "(//div[@class='fieldMessages_field__hR-R1'])[4]")
    public WebElement coverageArea ;

    @FindBy (xpath = "//li[@class='DropdownOverlayItem_unselectable__Pa5zw']")
    public List<WebElement> coverageAreaOptions ;

    @FindBy (xpath = "//button[@class='Button_buttonBase__26hAr Button_filled__1Lgot Button_button_primary__1BOBS Button_button_medium__2_2dm NetworkSelector_buttonSubmit__l3NsD']")
    public WebElement continueBtn ;

}
