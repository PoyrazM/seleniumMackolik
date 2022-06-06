package Tests;

import DriverSetUp.DriverPage;
import Pages.ChampionTeamPage;
import Pages.EnglandTablePage;
import Pages.HomePage;

import Pages.LeagueTablesPage;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BaseTest extends DriverPage {


    HomePage homePage;
    LeagueTablesPage tablesPage;
    EnglandTablePage englandTablePage;
    ChampionTeamPage champion;

    @Test(priority = 1)
    public void clickTableButton(){
        System.out.println("DRIVER = "+driver);
        homePage = new HomePage();
        homePage.clickTables();
        Reporter.log("User clicks Table Button SUCCESSFULLY");
    }

    @Test(priority = 2)
    public void selectLeague(){
        tablesPage = new LeagueTablesPage();
        tablesPage.leagueSelect();
        Reporter.log("User selects the league SUCCESSFULLY");
    }
    @Test(priority = 3)
    public void selectSeason(){
        tablesPage.seasonSelect();
        Reporter.log("User selects a Season of the League SUCCESSFULLY");
    }

    @Test(priority = 4)
    public void selectChampion(){
        englandTablePage = new EnglandTablePage();
        englandTablePage.championSelect();
        Reporter.log("User selects a 2016/2017 League Champion SUCCESSFULLY");
    }

    @Test(priority = 5)
    public void checkChampion(){
        champion = new ChampionTeamPage();
        champion.checkChampion();
        Reporter.log("User checks the Champion SUCCESSFULLY");
    }
}
