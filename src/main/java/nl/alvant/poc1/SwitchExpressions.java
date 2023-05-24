package nl.alvant.poc1;

/**
 * Switch Expressions
 * Preview in JDK 12 & 13 (–enable-preview aan compiler geven). Beschikbaar vanaf 14.
 */
public class SwitchExpressions {

    public static int dayOfWeek(DayOfWeek day) {
        return switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> 6;
            case TUESDAY -> getNumberSeven();
            case THURSDAY, SATURDAY -> 8;
            case WEDNESDAY -> 9;
            default -> throw new IllegalStateException("Unknown " + day);
        };
    }

    private static int getNumberSeven() {
        return 7;
    }

    enum DayOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY, UNKNOWN
    }
}
