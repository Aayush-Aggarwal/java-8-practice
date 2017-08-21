package stream.terminaloperations;

import org.junit.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

public class TerminalOperationDemoTest {
    TerminalOperationDemo terminalOperationDemo=new TerminalOperationDemo();

    @Test
    public void allMatchDemo() throws Exception {
        Boolean result=terminalOperationDemo.allMatchDemo();
        assert (!result);
    }

    @Test
    public void anyMatchDemo() throws Exception {
        Boolean result = terminalOperationDemo.anyMatchDemo();
        assert (result);
    }

    @Test
    public void noneMatchDemo() throws Exception {
        Boolean result =terminalOperationDemo.noneMatchDemo();
        assert (!result);
    }

    @Test
    public void countDemo() throws Exception {
        Long result = terminalOperationDemo.countDemo();
        assert (result ==3);
    }

    @Test
    public void findFirstDemo() throws Exception {
        Optional<String> result = terminalOperationDemo.findFirstDemo();
       assertEquals(Optional.of("Ayush"),result);

    }

    @Test
    public void maxDemo() throws Exception {
        Optional<String> result = terminalOperationDemo.maxDemo();
        assertEquals(Optional.of("Aggarwal"),result);
    }

    @Test
    public void minDemo() throws Exception {
        Optional<String> result = terminalOperationDemo.minDemo();
        assertEquals(Optional.of("aman"),result);
    }

}