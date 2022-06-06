package Pages;

import DriverSetUp.DriverPage;
import org.openqa.selenium.By;
import org.testng.Assert;

public class EnglandTablePage extends DriverPage {

    By championTeam = By.xpath("(//a[@class='style3'])[1]");

    public void championSelect(){
    driver.findElement(championTeam).click();
    String actualUrl = driver.getCurrentUrl();
    String expectedUrl = "http://arsiv.mackolik.com/Standings/Default.aspx?sId=41763";
    Assert.assertEquals(actualUrl,expectedUrl,"These URLs Are Not MATCHING!");
    }

}
