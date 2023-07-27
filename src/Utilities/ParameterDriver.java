package Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ParameterDriver {
    public WebDriver driver;

    @BeforeClass(alwaysRun = true)
    @Parameters("browser")
    public void createParameterDriver(String browserName) {
        closePreviousDrivers();
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        if (browserName.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        }
            driver.manage().window().maximize();
            Duration duration = Duration.ofSeconds(30);
            driver.manage().timeouts().pageLoadTimeout(duration);
            driver.manage().timeouts().implicitlyWait(duration);
        }
    @AfterClass(alwaysRun = true)
    public void quitDriver(){
        Tools.myWait(3);
        driver.quit();

        }
    public void login() {
        driver.get("https://opencart.abstracta.us/index.php?route=account/login");

        WebElement email = driver.findElement(By.id("input-email"));
        email.sendKeys("aliveliveli@gmail.com");

        WebElement password = driver.findElement(By.id("input-password"));
        password.sendKeys("Ali2023");

        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));
        loginButton.click();

    }
    public void login(String username, String pssword) {
        driver.get("https://opencart.abstracta.us/index.php?route=account/login");

        WebElement email = driver.findElement(By.id("input-email"));
        email.sendKeys(username);

        WebElement password = driver.findElement(By.id("input-password"));
        password.sendKeys(pssword);

        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));
        loginButton.click();

    }
    public void closePreviousDrivers() {
        try {
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


