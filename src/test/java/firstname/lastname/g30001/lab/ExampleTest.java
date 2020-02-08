package firstname.lastname.g30001.lab;

import org.junit.Test;
import firstname.lastname.g30001.lab.Example;

import static org.junit.Assert.assertEquals;

/**
 * @author mihai.hulea
 */
public class ExampleTest {

    @Test
    public void testAdd(){
        assertEquals("Should add 2 numbers", 30, Example.add(10,20));
    }
}
