package nl.alvant.poc2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordsTest {

    @Test
    public void testSimpleClass() {
        Records.createDataClasses();

        assertEquals(1, Records.point.x(), 0);
        assertEquals(5, Records.point.y(), 0);
        assertEquals(6, Records.point.add(), 0);

        assertEquals(1, Records.improvedPoint.x(), 0);
        assertEquals(5, Records.improvedPoint.y(), 0);
        assertEquals(6, Records.improvedPoint.add(), 0);
    }

    @Test
    public void testCircle() {
        Records.createCircle();

        assertEquals(78.55, Records.createCircle().area(), 0);
    }
}