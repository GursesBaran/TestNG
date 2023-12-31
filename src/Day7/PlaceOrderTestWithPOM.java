package Day7;

import Utilities.BaseDriver;
import Utilities.ParameterDriver;
import Utilities.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class PlaceOrderTestWithPOM extends ParameterDriver {

    @Test
    void placeOrderTest(){
        login();
        PlaceOrderElements elements = new PlaceOrderElements();
        elements.searchbox.sendKeys("ipod");
        elements.searchbutton.click();
        elements.addtocart.click();
        elements.cartbutton.click();
        elements.checkoutbutton.click();
        elements.continue1.click();
        elements.continue2.click();
        elements.continue3.click();
        elements.cash.click();
        elements.terms.click();
        elements.continue4.click();
        elements.confirmorder.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(elements.successmessage));
        Assert.assertTrue(elements.successmessage.getText().contains("successfully processed"));

    }


}
