package nl.alvant.poc1;

import org.junit.Test;

import static nl.alvant.poc1.SwitchExpressions.DayOfWeek.UNKNOWN;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class SwitchExpressionsTest {

    @Test
    public void test_6() {
        assertEquals(6, SwitchExpressions.dayOfWeek(SwitchExpressions.DayOfWeek.MONDAY));
        assertEquals(6, SwitchExpressions.dayOfWeek(SwitchExpressions.DayOfWeek.FRIDAY));
        assertEquals(6, SwitchExpressions.dayOfWeek(SwitchExpressions.DayOfWeek.SUNDAY));
    }

    @Test
    public void test_7() {
        assertEquals(7, SwitchExpressions.dayOfWeek(SwitchExpressions.DayOfWeek.TUESDAY));
    }

    @Test
    public void test_8() {
        assertEquals(8, SwitchExpressions.dayOfWeek(SwitchExpressions.DayOfWeek.THURSDAY));
        assertEquals(8, SwitchExpressions.dayOfWeek(SwitchExpressions.DayOfWeek.SATURDAY));
    }

    @Test
    public void test_9() {
        assertEquals(9, SwitchExpressions.dayOfWeek(SwitchExpressions.DayOfWeek.WEDNESDAY));
    }

    @Test
    public void test_exception() {
        try {
            SwitchExpressions.dayOfWeek(UNKNOWN);
            fail("exception expected");
        } catch (IllegalStateException e) {

        }
    }
}