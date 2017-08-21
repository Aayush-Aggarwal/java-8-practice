package stream.intermediateoperations;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;


public class IntermediateOperationDemoTest {
    IntermediateOperationDemo intermediateOperationDemo = new IntermediateOperationDemo();

    @Test
    public void filterDemo() throws Exception {
        List<String> result = intermediateOperationDemo.filterDemo();
        assert (result.get(0) == "1234567");
    }

    @Test
    public void distinctDemo() throws Exception {
        List<String> expectedResult = Arrays.asList("Ayush", "Aggarwal", "aman", "1234567");
        List<String> result = intermediateOperationDemo.distinctDemo();
        assert (result.equals(expectedResult));
    }

    @Test
    public void skipDemo() throws Exception {
        List<String> expectedResult = Arrays.asList("Aggarwal", "aman");
        List<String> result = intermediateOperationDemo.skipDemo();
        assert (result.equals(expectedResult));
    }

    @Test
    public void mapDemo() throws Exception {
        List<String> expectedResult = Arrays.asList("Ayushset", "Aggarwalset", "amanset", "1234567set");
        List<String> result = intermediateOperationDemo.mapDemo();
        assert (result.equals(expectedResult));
    }

    @Test
    public void flatmapDemo() throws Exception {
        List<String> expectedResult = Arrays.asList("Ayu", "hello1", "hello2");
        List<String> result = intermediateOperationDemo.flatmapDemo();
        assert (result.equals(expectedResult));
    }

    @Test
    public void sortedDemo() throws Exception {
        List<String> expectedResult = Arrays.asList("1234567", "Aggarwal", "Ayush","aman");
        List<String> result = intermediateOperationDemo.sortedDemo();
        assert (result.equals(expectedResult));
    }


}