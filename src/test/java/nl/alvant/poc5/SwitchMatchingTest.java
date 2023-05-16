package nl.alvant.poc5;

import junit.framework.TestCase;
import nl.alvant.poc3.Pentagon;
import nl.alvant.poc3.Square;
import nl.alvant.poc3.Triangle;
import org.junit.Test;

import java.awt.*;
import java.math.BigDecimal;

public class SwitchMatchingTest extends TestCase {

    @Test
    public void testBasic() {
        assertEquals("Null type", SwitchMatching.switcheroo(null));
        assertEquals("String: Alvant", SwitchMatching.switcheroo("Alvant"));
        assertEquals("Color with RGB: -10197916", SwitchMatching.switcheroo(new Color(100, 100, 100)));
        assertEquals("Array of ints, length: 3", SwitchMatching.switcheroo(new int[]{1, 2, 3}));
        assertEquals("100", SwitchMatching.switcheroo(new BigDecimal(100)));
    }

    @Test
    public void testBasic2() {
        assertEquals("Bad input", SwitchMatching.switcheroo2(null));
        assertEquals("String: Alvant", SwitchMatching.switcheroo2("Alvant"));
        assertEquals("Color with RGB: -10197916", SwitchMatching.switcheroo2(new Color(100, 100, 100)));
        assertEquals("Array of ints, length: 3", SwitchMatching.switcheroo2(new int[]{1, 2, 3}));
        assertEquals("Bad input", SwitchMatching.switcheroo2(new BigDecimal(100)));
    }

    @Test
    public void testBasicShape() {
        try {
            SwitchMatching.switchShapes(null);
            fail("Exception expected");
        } catch (NullPointerException e) {
        }
        assertEquals("Vijfhoek!", SwitchMatching.switchShapes(new Pentagon(5, 2)));
        assertEquals("Vierkant!", SwitchMatching.switchShapes(new Square(10, 5)));
        assertEquals("Driehoek!", SwitchMatching.switchShapes(new Triangle(8, 3)));
    }
}