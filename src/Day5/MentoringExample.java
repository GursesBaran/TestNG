package Day5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MentoringExample {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Set up the WebDriver before each test method
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() {
        // Close the WebDriver after each test method
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testGoogleTitle() {
        // Test to go to google.com and verify the title is "Google"
        driver.get("https://www.google.com/");
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match expected title");
    }
}

