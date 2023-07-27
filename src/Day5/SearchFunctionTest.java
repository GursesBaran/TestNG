package Day5;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class SearchFunctionTest extends BaseDriver {

    @Test
    @Parameters({"email","password", "searchKeyword"})
    void Test(String email, String password, String searchKeyword){

        login(email,password);
        WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search']"));
        search.sendKeys(searchKeyword);
        WebElement go = driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']"));
        go.click();

        List<WebElement> results = driver.findElements(By.cssSelector("div[class=\"caption\"] a"));
        for (WebElement e:results){


        }




    }
}
