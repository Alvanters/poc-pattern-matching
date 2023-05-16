package nl.alvant.poc3;

public record Triangle(double base, double length) implements Shape {

    @Override
    public double area() {
        return base * length * 0.5;
    }
}
