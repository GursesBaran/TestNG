package Day6;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertVsHardAssert {

    @Test
    void HardAssert() {
        String str1 = "Hello";
        System.out.println("Before Assertion");
        Assert.assertEquals("Hello World", str1, "your test failed"); // HARD ASSERT
        //IF ACTUAL AND EXPECTED RESULTS ARE DIFFERENT IT THROWS AN EXCEPTION AND DOESN'T RUN REST OF THE CODE
        //TESTNG STARTS RUNNING THE NEXT TESTS
        System.out.println("After Assertion");
    }

    @Test
    void softAssert() {
        String strHomePage = "www.facebook.com/homepage";
        String strCartPage = "www.facebook.com/cartpage";
        String strEditAccount = "www.facebook.com/editaccountpage";

        SoftAssert softAssert = new SoftAssert();

        System.out.println("Before first assert");
        softAssert.assertEquals("www.facebook.com/homepage", strHomePage);
        System.out.println("After first assert");

        System.out.println("Before second assert");
        softAssert.assertEquals("www.facebook.com/profile", strCartPage);
        System.out.println("After second assert");

        System.out.println("Before third assert");
        softAssert.assertEquals("www.facebook.com/setting", strEditAccount);
        System.out.println("After third assert");

        softAssert.assertAll();
    }
}