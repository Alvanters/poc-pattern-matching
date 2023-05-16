package nl.alvant.poc4;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class InstanceOfTest {

    @Test
    public void testOldStylez() {
        String input1 = "abcd";
        String input2 = "abcdefghijklmnopqrstuvwxyz";

        assertEquals(4, (int) InstanceOf.getStringLength(input1));
        assertEquals(26, (int) InstanceOf.getStringLength(input2));
        assertNull(InstanceOf.getStringLength(new BigDecimal("1")));
    }

    @Test
    public void testNewStylez() {
        String input1 = "abcd";
        String input2 = "abcdefghijklmnopqrstuvwxyz";

        assertEquals(4, (int) InstanceOf.getStringLength2(input1));
        assertEquals(26, (int) InstanceOf.getStringLength2(input2));
        assertNull(InstanceOf.getStringLength2(new BigDecimal("1")));
    }

    @Test
    public void testAdvancedNewStylez() {
        String input1 = "abcd";
        String input2 = "abcdefghijklmnopqrstuvwxyz";

        assertNull(InstanceOf.getStringLength3(input1));
        assertEquals(99, (int) InstanceOf.getStringLength3(input2));
        assertNull(InstanceOf.getStringLength3(new BigDecimal("1")));
    }

    @Test
    public void testScopeNewStylez() {
        String input1 = "abcd";
        String input2 = "abcdefghijklmnopqrstuvwxyz";

        assertEquals(4, (int) InstanceOf.getStringLength4(input1));
        assertEquals(26, (int) InstanceOf.getStringLength4(input2));
        assertNull(InstanceOf.getStringLength4(new BigDecimal("1")));
    }

    @Test
    public void testIntegerScopeNewStylez() {
        assertEquals(6, (int) InstanceOf.getIntValue(6));
        assertEquals(10, (int) InstanceOf.getIntValue(10f));
        assertEquals(9, (int) InstanceOf.getIntValue(9l));
        assertNull(InstanceOf.getIntValue(new BigDecimal("1")));
    }
}