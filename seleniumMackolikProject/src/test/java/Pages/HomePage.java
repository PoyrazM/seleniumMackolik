package Pages;

import DriverSetUp.DriverPage;
import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends DriverPage{


    By tablesButton = By.xpath("(//a[text()='Puan Durumu'])[1]");

    public void clickTables(){
        driver.findElement(tablesButton).click();
        String expectedTitle = "http://arsiv.mackolik.com/Puan-Durumu";
        String actualTitle = driver.getCurrentUrl();
        Assert.assertEquals(actualTitle,expectedTitle,"These URLs Are Not MATCHING!");
    }
}
