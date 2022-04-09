package Dzien9.Dzien1Task2;

import java.util.StringJoiner;

public class Circle {
    private float radius;
    private float area;
    private float circumference;

    public Circle(float radius) {
        this.radius = radius;
        this.area = (float)Math.PI * radius * radius;
        this.circumference = 2 * (float)Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + area +
                ", circumference=" + circumference +
                '}';
    }
}
