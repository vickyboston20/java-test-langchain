package test;
import static org.junit.Assert.*;

import org.junit.Test;

import src.Sample1;
public class Sample1Test {

    @Test
    public void testBinNumberValue() {
        Sample1 s = new Sample1();
        // The expected binNumber is 6.
        assertEquals("The binNumber should be 6", 6, s.getBinNumber());
    }
}
