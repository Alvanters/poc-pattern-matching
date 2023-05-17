package nl.alvant.poc6;

import nl.alvant.poc2.simple.ImprovedPoint;
import nl.alvant.poc6.rectangle.*;

/**
 * Preview in JDK 19 (–enable-preview aan compiler geven).
 */
public class PatternMatchingRecord {

    public static String calculatePythagoras(Object object) {
        if (object instanceof ImprovedPoint p) {
            double x = p.x();
            double y = p.y();
            return "Hypotonuse: " + Math.sqrt((x * x) + (y * y));
        }
        return null;
    }

    public static String calculatePythagorasSimplified(Object object) {
        if (object instanceof ImprovedPoint(double x, double y)) { // Deconstruction patterns werkt alleen met Records
            return "Hypotonuse: " + Math.sqrt((x * x) + (y * y));
        }
        return null;
    }

    public static String getColor(Rectangle r) {
        if( r instanceof ColourRectangle(ColourPoint topLeft, ColourPoint bottomRight)){
            return "Color: " + topLeft.c();
        }
        return null;
    }

    public static String getColorSimplified(Rectangle r) {
        if( r instanceof ColourRectangle(ColourPoint(Point p, Colour c), ColourPoint br)){
            return "Color: " + c;
        }
        return null;
    }

    public static String getTopLeftX(Rectangle r) {
        if( r instanceof ColourRectangle(ColourPoint(Point(double x, double y), Colour c), ColourPoint br)){
            return "Topleft: " + x;
        }
        return null;
    }

    public static String getAnotherTopLeftX(Rectangle r) {
        if( r instanceof ColourRectangle(ColourPoint(Point(var x, var y), var c), var br)){
            return "Topleft: " + x;
        }
        return null;
    }
}
