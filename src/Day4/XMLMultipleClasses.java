package Day4;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class XMLMultipleClasses {

    @Test
    void test1(){
        System.out.println("XMLMultipleClasses test1");
    }

    @Test
    void test2(){
        System.out.println("XMLMultipleClasses test2");
    }


    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class 2 is working");
    }
}

