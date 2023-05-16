package nl.alvant.poc3;

public record Square(double width, double height) implements Shape {
    @Override
    public double area() {
        return width * height;
    }
}
