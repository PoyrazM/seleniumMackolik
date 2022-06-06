package DriverSetUp;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class DriverPage {

    public static WebDriver driver;
    WebDriverManager manager;
    String baseUrl = "http://arsiv.mackolik.com/Default.aspx" ;

    @BeforeSuite
    public void setDriver(){
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--disable-notifications");
        manager.edgedriver().setup();
        driver = new EdgeDriver(options);
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("*****BROWSER IS STARTING*****");
        String actualUrl = baseUrl;
        String expectedUrl = "http://arsiv.mackolik.com/Default.aspx";
        Assert.assertEquals(actualUrl,expectedUrl,"These Urls Are Not MATCHING!");
    }

    @AfterSuite
    public void tearDown(){
        System.out.println("*****TEST FINISHED***** ");
        driver.quit();
    }


}
