package nl.alvant.poc5;

import nl.alvant.poc3.Pentagon;
import nl.alvant.poc3.Square;
import nl.alvant.poc3.Triangle;
import nl.alvant.poc5.questions.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuardedPatternsTest {

    @Test
    public void testBasicShape() {
        assertEquals("Vijfhoek!", GuardedPatterns.switchShapes(new Pentagon(5, 2)));
        assertEquals("Vierkant!", GuardedPatterns.switchShapes(new Square(10, 5)));
        assertEquals("Grote driehoek!", GuardedPatterns.switchShapes(new Triangle(8, 9)));
        assertEquals("Kleine driehoek!", GuardedPatterns.switchShapes(new Triangle(3, 1)));
    }

    @Test
    public void testQuestion1() {
        assertEquals("What?", GuardedPatterns.question1(new What()));
        assertEquals("Where?", GuardedPatterns.question1(new Where()));
        assertEquals("Why?", GuardedPatterns.question1(new Why()));
        assertEquals("How?", GuardedPatterns.question1(new When()));
    }

    @Test
    public void testQuestion2() {
        assertEquals("Why??", GuardedPatterns.question2(new Who()));
        assertEquals("What?", GuardedPatterns.question2(new What()));
        assertEquals("Where?", GuardedPatterns.question2(new Where()));
        assertEquals("Why?", GuardedPatterns.question2(new Why()));
        assertEquals("How?", GuardedPatterns.question2(new When()));
    }

    @Test
    public void testQuestion3() {
        assertEquals("Why??", GuardedPatterns.question3(new Who()));
        assertEquals("When?", GuardedPatterns.question3(new When()));
        assertEquals("What?", GuardedPatterns.question3(new What()));
        assertEquals("Where?", GuardedPatterns.question3(new Where()));
        assertEquals("Why?", GuardedPatterns.question3(new Why()));
    }
}