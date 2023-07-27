package Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class ParameterDriver {
    public WebDriver driver;

    @BeforeClass(alwaysRun = true)
    @Parameters("browser")
    public void createParameterDriver(String browserName) {

        if (browserName.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();

            driver.manage().window().maximize();
            Duration duration = Duration.ofSeconds(30);
            driver.manage().timeouts().pageLoadTimeout(duration);
            driver.manage().timeouts().implicitlyWait(duration);
        }

        }
    }
