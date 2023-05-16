package nl.alvant.poc2;

import nl.alvant.poc2.generic.Circle;
import nl.alvant.poc2.simple.ImprovedPoint;
import nl.alvant.poc2.simple.Point;

/**
 * Preview in JDK 14 & 15 (–enable-preview aan compiler geven). Beschikbaar vanaf 16.
 * Voorkomt boilerplate van:
 * Getters
 * AllArgs Constructor
 * toString
 * Equals & HashCode
 */
public class Records {

    static Point point;
    static ImprovedPoint improvedPoint;

    public static void createDataClasses() {
        point = new Point(1, 5);
        improvedPoint = new ImprovedPoint(1, 5);
    }

    public static Circle createCircle() {
        return new Circle(5);
    }
}