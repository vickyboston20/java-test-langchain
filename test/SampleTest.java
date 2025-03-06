package test;
import static org.junit.Assert.*;

import org.junit.Test;
public class SampleTest {

    @Test
    public void testLeftPadding() {
        // Test left padding: for number 6, left padded to 6 digits should be "000006"
        String formatted = BinNumberUtil.BIN_NUMBER(6, '0', PaddingDirection.LEFT);
        assertEquals("Left padded value should be '000006'", "000006", formatted);
    }

    @Test
    public void testRightPadding() {
        // Test right padding: for number 6, right padded to 6 digits should be "600000"
        String formatted = BinNumberUtil.BIN_NUMBER(6, '0', PaddingDirection.RIGHT);
        assertEquals("Right padded value should be '600000'", "600000", formatted);
    }

    @Test
    public void testNoPaddingNeeded() {
        // When the number already has 6 or more digits, it should return the number as is.
        String formatted = BinNumberUtil.BIN_NUMBER(123456, '0', PaddingDirection.LEFT);
        assertEquals("No padding needed for 6-digit number", "123456", formatted);
    }

    @Test
    public void testNumberExceedingLength() {
        // If the number has more than 6 digits, the function returns it unchanged.
        String formatted = BinNumberUtil.BIN_NUMBER(1234567, '0', PaddingDirection.LEFT);
        assertEquals("Number with more than 6 digits should remain unchanged", "1234567", formatted);
    }
}

