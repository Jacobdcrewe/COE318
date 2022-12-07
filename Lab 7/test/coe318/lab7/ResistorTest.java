package coe318.lab7;


import coe318.lab7.Resistor;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jacob Crewe
 */
public class ResistorTest {
    
    public ResistorTest() {
    }
    
    @Test
    public void testGetNodes() {
        System.out.println("Testing getNodes Method");
        Resistor r = new Resistor(1, 2, 4.2);
        int[] expected = new int[] {1, 2};
        if(!(expected[0]==r.getNodes()[0])) {
            fail("The test failed at node 1");
        }
        if(!(expected[1]==r.getNodes()[1])){
            fail("The test failed at node 2");
        }

    }
    
    @Test
    public void testToString() {
        System.out.println("Testing toString Method");
        Resistor r = new Resistor(1, 2, 3);
        String expected = "R1 1 2 3.0";
        String result = r.toString();
        assertEquals(expected,result);
    }

    
}