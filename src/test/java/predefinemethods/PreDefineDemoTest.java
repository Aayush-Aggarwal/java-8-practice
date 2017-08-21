package predefinemethods;

import org.junit.Test;

import static org.junit.Assert.*;

public class PreDefineDemoTest {
    PreDefineDemo preDefineDemo = new PreDefineDemo();

    @Test
    public void predicateDemo() throws Exception {
        boolean result = preDefineDemo.predicateDemo();
        assert (result == true);
    }

    @Test
    public void supplierDemo() throws Exception {
        String result = preDefineDemo.supplierDemo();
        assert (result == "hello world");
    }

    @Test
    public void unaryOperatorDemo() throws Exception {
        int result = preDefineDemo.unaryOperatorDemo();
        assert (result == 2);
    }

    @Test
    public void binaryOperatorDemo() throws Exception {
        int result = preDefineDemo.binaryOperatorDemo();
        assert (result == -7);
    }

  /*  @Test
    public void consumerDemo() throws Exception {

    }*/

    @Test
    public void functionDemo() throws Exception {
        int result = preDefineDemo.functionDemo();
        assert (result == 5);
    }


}