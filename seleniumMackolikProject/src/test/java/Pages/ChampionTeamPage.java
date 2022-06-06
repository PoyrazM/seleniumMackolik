package Pages;

import DriverSetUp.DriverPage;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class ChampionTeamPage extends DriverPage {

    public void checkChampion(){
        List<String> myTabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(myTabs.get(1));
        String actualText = driver.getTitle();
        String expectedText = "Chelsea Futbol Takımı - 2016/2017 @ Mackolik.com";
        Assert.assertEquals(actualText,expectedText,"Titles Are Not Matching");
    }


}
