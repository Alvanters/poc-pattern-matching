package nl.alvant.poc2.simple;

public record ImprovedPoint(double x, double y) {
    public double add() {
        return x + y;
    }
}
