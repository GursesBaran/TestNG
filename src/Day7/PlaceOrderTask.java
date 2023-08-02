package Day7;

import Utilities.BaseDriver;
import Utilities.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class PlaceOrderTask extends BaseDriver {

    @Test(dataProvider = "keywordGenerator")
    public void Test() {

        login();
        WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search']"));
        search.sendKeys("ipod");
        WebElement searchbutton = driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']"));
        searchbutton.click();
        WebElement ipodclassicaddtocart = driver.findElement(By.xpath("//div[@id='content']//div[1]//div[1]//div[2]//div[2]//button[1]//span[1]"));
        ipodclassicaddtocart.click();
        WebElement cartbutton = driver.findElement(By.xpath("//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']"));
        cartbutton.click();
        WebElement checkout = driver.findElement(By.xpath("//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']"));
        checkout.click();
        WebElement continue1 = driver.findElement(By.xpath("//input[@id='button-payment-address']"));
        continue1.click();
        Tools.myWait(2);
        WebElement continue2 = driver.findElement(By.xpath("//input[@id='button-shipping-address']"));
        continue2.click();
        WebElement continue3 = driver.findElement(By.xpath("//input[@id='button-shipping-method']"));
        continue3.click();
        Tools.myWait(2);
        WebElement cash = driver.findElement(By.xpath("//input[@value='cod']"));
        cash.click();
        WebElement terms = driver.findElement(By.xpath("//input[@name='agree']"));
        terms.click();
        WebElement continue4 = driver.findElement(By.xpath("//input[@id='button-payment-method']"));
        continue4.click();
        WebElement confirmorder = driver.findElement(By.xpath("//input[@id='button-confirm']"));
        confirmorder.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@id='content']//p)[1]")));

        WebElement successMessage = driver.findElement(By.xpath("(//div[@id='content']//p)[1]"));
        System.out.println("success message = " + successMessage.getText());

        Assert.assertTrue(successMessage.getText().contains("successfully processed"));

    }

    @DataProvider(name = "keywordGenerator")
    public Object[][] searchKeyword() {

        Object[][] keyword = {{"ipod"}};
        return keyword;
    }


}