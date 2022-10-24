package com.cydeo.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BrowserUtils {


    public static void sleep(int seconds){
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void verifyTitle( String expectedTitle){
        Assert.assertEquals(expectedTitle,Driver.getDriver().getTitle());
    }

    public static void waitForInvisibilityOf(WebElement element,int seconds){
        WebDriverWait wait =new WebDriverWait(Driver.getDriver(),seconds);
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    public static void waitForVisibilityOf(WebElement element,int seconds){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),seconds);
        wait.until(ExpectedConditions.visibilityOf(element));
    }


}
