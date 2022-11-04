package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HioscarPage extends BasePage{

    @FindBy (css = "button[class='Button_button__1_TCE CTABase_base__dmoHJ CTABase_base_secondary__10EcP CTABase_base_hideFocus__1ZmK1 CTABase_oscar2020_light__2O5XN CTABase_base_button__3E47u']")
    public WebElement searchNetworkBtn ;

    @FindBy(xpath = "(//div[@class='DropdownOverlayAttachment_triggerContainer__129mH'])[1]")
    public  WebElement coverageYear ;

    @FindBy (xpath = "//ul[@id='unnamed-20']//div")
    public List<WebElement> coverageYearOptions;

    @FindBy (xpath = "(//div[@class='DropdownOverlayAttachment_triggerContainer__129mH'])[2]")
    public WebElement coverageAccess ;

    @FindBy (xpath = "//li[@class='DropdownOverlayItem_unselectable__Pa5zw']/div")
    public List<WebElement> accessOptions ;

    @FindBy (xpath = "(//div[@class='Dropdown_visibleContent__NGHUm'])[3]")
    public WebElement networkPartner ;

    @FindBy (xpath = "//div[@class='DropdownOverlayItem_item__36OV6 DropdownOverlayItem_item_size-small__3eMNL']")
public List<WebElement> networkPartnerOption ;



}
