package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
    private Driver(){}//private constructor, limit access to obj of this class from outside the class

   private static InheritableThreadLocal<WebDriver> driverPool =new InheritableThreadLocal<>();

    public static WebDriver getDriverPool(){
        if (driverPool.get() == null){
            String browserType = ConfigReader.getProperty("browser");
            switch (browserType){
                case "chrome" :
                    WebDriverManager.chromedriver().setup();
                    driverPool.set(new ChromeDriver()) ;
                    driverPool.get().manage().window().maximize();
                    //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driverPool.set(new ChromeDriver());
                    driverPool.get().manage().window().maximize();
                   // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
            }
        }
        return driverPool.get();
    }

    public static void closeDriver (){ //this method will make sure our driver value is always null after using quit() method
        if (driverPool.get() != null){
            driverPool.get().quit();//will kill the session,
            driverPool.remove();
        }
    }




}
