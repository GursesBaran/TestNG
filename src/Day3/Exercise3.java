package Day3;

import Utilities.BaseDriver;
import Utilities.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Exercise3 extends BaseDriver {

    /**
     * Go to "https://opencart.abstracta.us/index.php?route=account/login
     * Log in
     * Click on News Letter
     * Click on Yes
     * Click on Continue
     * Validate you see the success message
     * <p>
     * <p>
     * in a different test
     * Click on News Letter
     * Click on No
     * Click on Continue
     * Validate you see the success message
     * <p>
     * <p>
     * in a different test
     * Click on News Letter
     * Make it Yes if it is No or make it No if it is Yes
     * Validate you see the success message
     **/


    @Test()
    void subscribeNewLetterTest() {
        login();
        WebElement newsletterButton = driver.findElement(By.xpath("(//a[.='Newsletter'])[1]"));
        newsletterButton.click();

        WebElement yesOption = driver.findElement(By.xpath("//input[@value='1']"));
        yesOption.click();

        WebElement continueButton = driver.findElement(By.xpath("//input[@value='Continue']"));
        continueButton.click();

        Tools.successMessageValidation();
    }

    @Test(priority = 1, dependsOnMethods = "subscribeNewLetterTest")
    void unsubscribeNewLetterTest() {

        WebElement newsletterButton = driver.findElement(By.xpath("(//a[.='Newsletter'])[1]"));
        newsletterButton.click();

        WebElement noOption = driver.findElement(By.xpath("//input[@value='0']"));
        noOption.click();

        WebElement continueButton = driver.findElement(By.xpath("//input[@value='Continue']"));
        continueButton.click();

        Tools.successMessageValidation();
    }

    @Test(priority = 2, dependsOnMethods = "subscribeNewLetterTest")
    void switchNewsletterSubscription() {

        WebElement newsletterButton = driver.findElement(By.xpath("(//a[.='Newsletter'])[1]"));
        newsletterButton.click();

        WebElement noOption = driver.findElement(By.xpath("//input[@value='0']"));
        WebElement yesOption = driver.findElement(By.xpath("//input[@value='1']"));

        if (noOption.isSelected()) {
            yesOption.click();
        } else {
            noOption.click();
        }

        WebElement continueButton = driver.findElement(By.xpath("//input[@value='Continue']"));
        continueButton.click();

        Tools.successMessageValidation();
    }
}
