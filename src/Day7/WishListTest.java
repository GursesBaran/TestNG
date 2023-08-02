package Day7;

import Utilities.ParameterDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class WishListTest extends ParameterDriver {

    @Test
    @Parameters("searchKeyword")
    void wishListTest(String searchKeyword){
        login();

        PlaceOrderElements plc = new PlaceOrderElements();

        plc.searchbox.sendKeys(searchKeyword);
        plc.searchbutton.click();

        WishListTestElements wishList = new WishListTestElements();

        int randomIndex = (int)(Math.random()*wishList.wishListButtons.size());

        wishList.wishListButtons.get(randomIndex).click();

        String productName = wishList.productTitles.get(randomIndex).getText();

        wishList.wishListIcon.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//td[@class='text-left']//a)[2]")));
        Assert.assertEquals(wishList.productNameOnWishList.getText(),productName);


    }
}

