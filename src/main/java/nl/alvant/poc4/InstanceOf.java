package nl.alvant.poc4;

/**
 * Preview in JDK 14 & 15 (–enable-preview aan compiler geven). Beschikbaar vanaf 16.
 */
public class InstanceOf {

    public static Integer getStringLength(Object object) {
        if (object instanceof String) {
            String s = (String) object;
            return s.length();
        }
        return null;
    }

    public static Integer getStringLength2(Object object) {
        if (object instanceof String s) {
            return s.length();
        } else {
            // s is hier niet in scope
            return null;
        }
    }

    public static Integer getStringLength3(Object object) {
        // Kan hier geen OR gebruiken (Compiler error), left evaluation is dan geen String en dus is s niet gedefinieerd.
        if (object instanceof String s && s.length() > 8) {
            return 99;
        } else {
            // s is hier niet in scope
            return null;
        }
    }

    public static Integer getStringLength4(Object object) {
        if (!(object instanceof String s)) {
            return null;
        } else {

            // hier allerlei logica

            return s.length();
        }
    }

    public static Integer getIntValue(Object object) {
        System.out.println("----");
        if (object instanceof Integer num) {
            System.out.println("Integer");
            System.out.println(num);
            return num;
        } else if (object instanceof Float num) {
            System.out.println("Float");
            System.out.println(num);
            return num.intValue();
        } else if (object instanceof Long num) {
            System.out.println("Long");
            System.out.println(num);
            return num.intValue();
        }
        return null;
    }
}
