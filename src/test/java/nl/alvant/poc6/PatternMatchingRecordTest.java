package nl.alvant.poc6;

import nl.alvant.poc2.simple.ImprovedPoint;
import nl.alvant.poc6.rectangle.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class PatternMatchingRecordTest {

    ColourRectangle input;

    @Before
    public void setup() {
        input = new ColourRectangle(
                new ColourPoint(new Point(5, 2), Colour.GREEN),
                new ColourPoint(new Point(1, 1), Colour.GREEN));
    }

    @Test
    public void testCalculatePythagoras() {
        assertEquals("Hypotonuse: 5.385164807134504", PatternMatchingRecord.calculatePythagoras(new ImprovedPoint(5, 2)));
        assertNull(PatternMatchingRecord.calculatePythagoras(new Point(10, 5)));
    }

    @Test
    public void testCalculatePythagorasSimplified() {
        assertEquals("Hypotonuse: 5.385164807134504", PatternMatchingRecord.calculatePythagorasSimplified(new ImprovedPoint(5, 2)));
        assertNull(PatternMatchingRecord.calculatePythagorasSimplified(new Point(10, 5)));
    }

    @Test
    public void testColor() {
        assertEquals("Color: GREEN", PatternMatchingRecord.getColor(input));
        assertNull(PatternMatchingRecord.getColor(new EmptyRectangle()));
    }

    @Test
    public void testGetSimplifiedColor() {
        assertEquals("Color: GREEN", PatternMatchingRecord.getColor(input));
        assertNull(PatternMatchingRecord.getColorSimplified(new EmptyRectangle()));
    }

    @Test
    public void testGetTopLeftX() {
        assertEquals("Topleft: 5.0", PatternMatchingRecord.getTopLeftX(input));
        assertNull(PatternMatchingRecord.getTopLeftX(new EmptyRectangle()));
    }

    @Test
    public void testGetAnotherTopLeftX() {
        assertEquals("Topleft: 5.0", PatternMatchingRecord.getAnotherTopLeftX(input));
        assertNull(PatternMatchingRecord.getAnotherTopLeftX(new EmptyRectangle()));
    }
}