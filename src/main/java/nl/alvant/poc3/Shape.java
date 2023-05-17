package nl.alvant.poc3;

/**
 * Sealed Classes/Interfaces
 * Preview in JDK 15 & 16 (–enable-preview aan compiler geven). Beschikbaar vanaf 17.
 */
public sealed interface Shape permits Triangle, Square, Pentagon {

    double area();
}
