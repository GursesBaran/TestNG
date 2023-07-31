package Day6;

import org.testng.annotations.Test;

public class DataProviderWithDifferentClass {

    @Test(dataProvider = "credentialsList",dataProviderClass = DataProvider1.class)
    void Test1(String username, String password){
        System.out.println("Test 1 started");
        System.out.println("Test 1 is running for Username = " + username + " // Password = " + password);
        System.out.println("Test 1 completed");
    }
}
