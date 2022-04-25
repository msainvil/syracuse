package esiea.tools.math;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MathTest {
    @Test
    void testAddIntInt() {
        assertEquals(Math.add(0, 1), 1);
        assertEquals(Math.add(-6, 6), 0);
    }
    
    @Test
    void testAddDoubleDouble() {
        assertEquals(Math.add(0.1, 1.1), 1.2000000000000002);
        assertEquals(Math.add(6.6, 6.1), 12.7);
    }
    
    @Test
    void testsubtractIntInt() {
        assertEquals(Math.subtract(2, 1), 1);
        assertEquals(Math.subtract(37, 10), 27);
    }
    void testsubtractDoubleDouble() {
        assertEquals(Math.subtract(2.1, 1.1), 1.0);
        assertEquals(Math.subtract(37.2, 10.2), 27.0);
    }
    @Test
    void testmultiplyIntInt() {
        assertEquals(Math.multiply(2, 2), 4);
        assertEquals(Math.multiply(3, 10), 30);
    }
    @Test
    void testmultiplyDoubleDouble() {
        assertEquals(Math.multiply(2.1, 1.1), 2.3100000000000005);
        assertEquals(Math.multiply(0.5, 10), 5);
    }
    @Test
    void testdivideIntInt() {
        assertEquals(Math.divide(10, 2), 5);
        assertEquals(Math.divide(21, 3), 7);
    }
    @Test
    void testdivideDoubleDouble() {
        assertEquals(Math.divide(10.0, 2.0), 5.0);
        assertEquals(Math.divide(21.0, 7.0), 3.0);
    }


    
}
