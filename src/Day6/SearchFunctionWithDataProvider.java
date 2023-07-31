package Day6;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class SearchFunctionWithDataProvider extends BaseDriver {

    @Test(dataProvider = "searchKeyword")
    public void Test1(String searchKeyword) {
        if (searchKeyword.equalsIgnoreCase("mac")) {
            login();
        }
        WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search']"));
        search.clear();
        search.sendKeys(searchKeyword);

        WebElement searchbutton = driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']"));
        searchbutton.click();


        List<WebElement> results = driver.findElements(By.cssSelector("div[class=\"caption\"] a"));

        for (WebElement e : results)
            Assert.assertTrue(e.getText().toLowerCase().contains(searchKeyword));

    }
        @DataProvider(name = "searchKeyword")
        public Object[][] electronicsList() {
            Object[][] electronicsList = {
                    {"mac"},
                    {"samsung"},
                    {"ipod"}
            };
            return electronicsList;
        }
    }


