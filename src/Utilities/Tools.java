package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Tools {

    public static void successMessageValidation() {
        WebElement successMessage = null;

        try {
            successMessage = new WebDriverWait(BaseDriver.driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='alert alert-success alert-dismissible']")));
        } catch (Exception e) {
            // Handle the exception or log it as needed
            throw new RuntimeException("Success message not found within the specified time.", e);
        }

        Assert.assertNotNull(successMessage, "Success message element not found");
        Assert.assertTrue(successMessage.getText().contains("successfully"), "Success message does not contain expected text");
    }

    public static void myWait(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}