package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;


public class Driver {
    private Driver(){}//private constructor, limit access to obj of this class from outside the class

   private static InheritableThreadLocal<WebDriver> driverPool =new InheritableThreadLocal<>();

    public static WebDriver getDriverPool(){


        if (driverPool.get() == null){
            String browserType = "";

            if( System.getProperty("BROWSER") == null){
                browserType = ConfigReader.getProperty("browser");
            } else {
                browserType = System.getProperty("BROWSER");
            }

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
                case "remote-chrome":
                    try {
                        // assign your grid server address
                        String gridAddress = "54.234.248.112";
                        URL url = new URL("http://"+ gridAddress + ":4444/wd/hub");
                        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
                        desiredCapabilities.setBrowserName("chrome");
                        driverPool.set(new RemoteWebDriver(url, desiredCapabilities));
                        //driverPool.set(new RemoteWebDriver(new URL("http://0.0.0.0:4444/wd/hub"),desiredCapabilities));

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case "remote-firefox":
                    try {
                        // assign your grid server address
                        String gridAddress = "174.129.57.20";
                        URL url = new URL("http://"+ gridAddress + ":4444/wd/hub");
                        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
                        desiredCapabilities.setBrowserName("firefox");
                        driverPool.set(new RemoteWebDriver(url, desiredCapabilities));
                        //driverPool.set(new RemoteWebDriver(new URL("http://0.0.0.0:4444/wd/hub"),desiredCapabilities));

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;

                //IP --> 44.201.219.205
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
