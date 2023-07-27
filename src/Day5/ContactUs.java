package Day5;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ContactUs extends BaseDriver {

    @Test
    @Parameters("message")
    void Test(String msg){

        login();
        WebElement contactus = driver.findElement(By.xpath("//ul[@class='list-unstyled']//a[contains(text(),'Contact Us')]"));
        contactus.click();
        WebElement message = driver.findElement(By.xpath("//textarea[@id='input-enquiry']"));
        message.sendKeys(msg);
        WebElement submit = driver.findElement(By.xpath("//input[@value='Submit']"));
        submit.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("success"));





    }
}
