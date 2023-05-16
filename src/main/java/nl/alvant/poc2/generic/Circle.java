package nl.alvant.poc2.generic;

public record Circle(double radius) {
    private static final double pi = 3.142;

    public double area() {
        return pi * radius * radius;
    }
}
