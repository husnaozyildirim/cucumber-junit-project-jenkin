package com.cydeo.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;


public class BrowserUtils {


    public static void sleep(int seconds){
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void verifyTitle( String expectedTitle){
        String actualTitle = Driver.getDriverPool().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    public static void waitForInvisibilityOf(WebElement element,int seconds){
        WebDriverWait wait =new WebDriverWait(Driver.getDriverPool(),seconds);
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    public static void waitForVisibilityOf(WebElement element,int seconds){
        WebDriverWait wait = new WebDriverWait(Driver.getDriverPool(),seconds);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    /**
     *
     * @return
     */
    public static List<String> dropdownOptionsAsString(WebElement dropdownElement){
        Select select = new Select(dropdownElement);
        List<WebElement> actualOptionsAsWebElement = select.getOptions();
        List<String> actualOptionsAsString = new ArrayList<>();
        for (WebElement each : actualOptionsAsWebElement) {
            actualOptionsAsString.add(each.getText());
        }
        return actualOptionsAsString ;
    }

    /**
     * this method will accept of radio button as a List<WebElement>
     *     it will loop through the List, and click to the radio button with provided attribute value
     * </WebElement>
     * @param radioBtn
     * @param attributeValue
     */
    public static void clickRadioButton(List<WebElement> radioBtn,String attributeValue){
        radioBtn.stream().forEach(p -> {
            if (p.getAttribute("value").equalsIgnoreCase(attributeValue)) p.click();
        });
    }

}
