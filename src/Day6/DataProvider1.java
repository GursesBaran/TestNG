package Day6;
import Utilities.BaseDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 extends BaseDriver {


    @Test(dataProvider = "usernameList")
    void Test1(String username) {
        System.out.println("Test 1 is running for username " + username);
    }

    @Test(dataProvider = "credentials")
    void test2(String username, String password) {
        System.out.println("Test 2 is started");
        System.out.println("Test 2 is running for username = " + username + " and password = " + password);
        System.out.println("Test 2 is completed");
    }

    @DataProvider
    public Object[][] usernameList() {
        Object[][] usernames = {
                {"John"},
                {"George"},
                {"Jessica"}
        };
        return usernames;
    }

    @DataProvider
    public Object[][] credentials() {
        Object[][] credentials = {
                {"John", "john1234"},
                {"George", "g1eorge"},
                {"Jessica", "qwerty12345"}
        };
        return credentials;
    }
}