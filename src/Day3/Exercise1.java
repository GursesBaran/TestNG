package Day3;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Exercise1 extends BaseDriver {

    /**
     * Go to "https://opencart.abstracta.us/index.php?route=account/login"
     * Login
     * Click on Edit Account
     * Update name
     * Click on Continue
     * Verify the success message
     * Then update the name with the old name
     **/

    @Test
    void updateNameTest() {
        login();
        editName("Batch88");
        editName("Batch8");
    }

    void editName(String name) {

        WebElement editAccountButton = driver.findElement(By.xpath("//a[.='Edit Account']"));
        editAccountButton.click();

        WebElement firstName = driver.findElement(By.id("input-firstname"));
        firstName.clear();
        firstName.sendKeys(name);

        WebElement continueButton = driver.findElement(By.xpath("//input[@value='Continue']"));
        continueButton.click();

        WebElement successMessage = driver.findElement(By.xpath("//div[.=' Success: Your account has been successfully updated.']"));

        Assert.assertTrue(successMessage.getText().contains("successfully updated"));
    }


}
