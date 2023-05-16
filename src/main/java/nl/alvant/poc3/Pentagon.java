package nl.alvant.poc3;

public record Pentagon(double side, double radius) implements Shape {
    @Override
    public double area() {
        return (side * radius * 0.5) * 5;
    }
}
