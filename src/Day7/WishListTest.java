package Day7;

import Utilities.ParameterDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

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

        Assert.assertEquals(wishList.productNameOnWishList.getText(),productName);

        //TODO create the xml file for this test
    }
}

