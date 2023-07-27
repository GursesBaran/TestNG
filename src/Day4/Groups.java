package Day4;

import org.testng.annotations.Test;

public class Groups {

    @Test(groups = "SmokeTest")
    void test1(){
        System.out.println("Test 1 is running");
    }

    @Test(groups = "RegressionTest")
    void test2(){
        System.out.println("Test 2 is running");
    }

    @Test()
    void test3(){
        System.out.println("Test 3 is running");
    }

    @Test(groups = "SmokeTest")
    void test4(){
        System.out.println("Test 4 is running");
    }

    @Test(groups = "RegressionTest")
    void test5(){
        System.out.println("Test 5 is running");
    }

    @Test(groups = {"SmokeTest","RegressionTest"})
    void test6(){
        System.out.println("Test 6 is running");
    }
}
