package Day6;

import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProviderWithIterator {

    @DataProvider
    public Iterator<Object[]> dataList() {
        List<Object[]> myData = new ArrayList<>();
        myData.add(new Object[]{"John"});
        myData.add(new Object[]{"Jessica"});
        myData.add(new Object[]{"Jake"});

        return myData.iterator();

    }
}
