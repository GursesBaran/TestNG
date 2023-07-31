package Day6;
import Utilities.BaseDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 extends BaseDriver {


    @Test(dataProvider = "usernameList")
    void Test1(String username) {
        System.out.println("Test 1 is running for username " + username);
    }

    @Test(dataProvider = "credentialsList")
    void test2(String username, String password) {
        System.out.println("Test 2 is started");
        System.out.println("Test 2 is running for username = " + username + " and password = " + password);
        System.out.println("Test 2 is completed");
    }

    @DataProvider
    public Object[][] usernameList() {
        Object[][] usernamesList = {
                {"John"},
                {"George"},
                {"Jessica"}
        };
        return usernamesList;
    }

    @DataProvider(name = "credentialsList")
    public Object[][] credentialsList() {
        Object[][] credentialsList = {
                {"John", "john1234"},
                {"George", "g1eorge"},
                {"Jessica", "qwerty12345"}
        };
        return credentialsList;
    }
}