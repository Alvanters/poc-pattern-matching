package nl.alvant.poc5;

import nl.alvant.poc3.Pentagon;
import nl.alvant.poc3.Shape;
import nl.alvant.poc3.Square;
import nl.alvant.poc3.Triangle;
import nl.alvant.poc5.questions.*;

/**
 * Guarded Pattern
 * Preview in JDK 18 (–enable-preview aan compiler geven).
 * Guarded Pattern: PrimaryPattern && ConditionalAndExpression
 */
public class GuardedPatterns {

    public static String switchShapes(Shape shape) {
        return switch (shape) {
            case Triangle t when t.area() > 25 -> "Grote driehoek!";
            case Triangle t -> "Kleine driehoek!";
            case Square s -> "Vierkant!";
            case Pentagon p -> "Vijfhoek!";
            case Shape s -> "Vorm";
        };
    }

    public static String question1(Interrogator q) {
        return switch (q) {
            case What what -> "What?";
            case Where where -> "Where?";
            case Why why -> "Why?";
            default -> "How?";
        };
    }

    public static String question2(Interrogator q) {
        return switch (q) {
            case Who what when where() -> why();
            case What what -> "What?";
            case Where where -> "Where?";
            case Why why -> "Why?";
            default -> "How?";
        };
    }

    public static String question3(Interrogator q) {
        return switch (q) {
            case Who what when where() -> why();
            case When when when when.when() -> when();
            case What what -> "What?";
            case Where where -> "Where?";
            case Why why -> "Why?";
            default -> "How?";
        };
    }

    private static boolean where() {
        return true;
    }

    private static String why() {
        return "Why??";
    }

    private static String when() {
        return "When?";
    }
}
