package Day2;


import Utilities.BaseDriver;

import org.testng.annotations.Test;

public class Enable extends BaseDriver {

    @Test
    void test1() {
        System.out.println("Test 1");
    }

    @Test
    void test2() {
        System.out.println("Test 2");
    }

    @Test(enabled = true)
    void test3() {
        System.out.println("Test 3");
    }

    @Test(enabled = false)
        // enable = false -> disables this test. Default value is true
    void test4() {
        System.out.println("Test 4");
    }

    @Test
    void test5() {
        System.out.println("Test 5");
    }

    @Test(enabled = false)
    void test6() {
        System.out.println("Test 6");
    }

 //   WebDriver driver;

//    @BeforeClass
//    void createDriver() {
//
//        Logger logger = Logger.getLogger("");
//        logger.setLevel(Level.SEVERE);
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//
//        Duration duration = Duration.ofSeconds(30);
//        driver.manage().timeouts().pageLoadTimeout(duration);
//        driver.manage().timeouts().implicitlyWait(duration);
//
//    }
//
//    @AfterClass
//    void quitDriver() {
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        driver.quit();
//    }


}
