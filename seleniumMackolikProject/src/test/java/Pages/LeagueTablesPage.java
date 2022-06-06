package Pages;

import DriverSetUp.DriverPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class LeagueTablesPage extends DriverPage {

    By selectLeague = By.id("cboLeague");
    By selectSeason = By.id("cboSeason");
    Select select;
    public void leagueSelect(){
        select = new Select(driver.findElement(selectLeague));
        select.selectByValue("24-17");
        String expectedUrl = "http://arsiv.mackolik.com/Puan-Durumu/24/INGILTERE-Premier-Lig";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl,"These URLs Are Not MATCHING!");

    }

    public void seasonSelect() {
        select = new Select(driver.findElement(selectSeason));
        select.selectByVisibleText("2016/2017");
        String expectedTitle = "İngiltere Premier Lig - 2016/2017 - Puan Durumu, Fikstür, Maç Sonuçları, iddaa İstatistikleri, Haberler, Forum, Anket @ Mackolik.com";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"These Titles Are Not MATCHING!");
    }
}
