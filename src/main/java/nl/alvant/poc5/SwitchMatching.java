package nl.alvant.poc5;

import nl.alvant.poc3.Pentagon;
import nl.alvant.poc3.Shape;
import nl.alvant.poc3.Square;
import nl.alvant.poc3.Triangle;

import java.awt.*;

/**
 * Pattern Matching for Switch
 * Preview in JDK 17 (–enable-preview aan compiler geven).
 */
public class SwitchMatching {

    public static String switcheroo(Object object) {
        return switch (object) {
            case null ->
                    "Null type"; // Als deze niet wordt gedefinieerd, dan wordt 'case null' door de compiler als bovenin de lijst gezet met een NPE
            case String s -> "String: " + s;
            case Color c -> "Color with RGB: " + c.getRGB();
            case int[] ia -> "Array of ints, length: " + ia.length;
            default -> object.toString();
        };
    }

    public static String switcheroo2(Object object) {
        return switch (object) {
            case String s -> "String: " + s;
            case Color c -> "Color with RGB: " + c.getRGB();
            case int[] ia -> "Array of ints, length: " + ia.length;
            case null, default -> "Bad input";
        };
    }

    public static String switchShapes(Shape shape) {
        return switch (shape) {
            //  case Shape s -> "Vorm"; // Minder specifieke mag niet de specifieke cases verbergen!!
            case Triangle t -> "Driehoek!";
            case Square s -> "Vierkant!";
            case Pentagon p -> "Vijfhoek!";
            case Shape s -> "Vorm";
            // Alle (mogelijke) waarden moeten afgevangen worden, of dan wel door default expressie of door alle mogelijke expressies toe te passen
        };
    }

}
