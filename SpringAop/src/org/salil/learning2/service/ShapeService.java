package org.salil.learning2.service;

import org.salil.learning2.model.Circle;
import org.salil.learning2.model.Triangle;

public class ShapeService {

    private Triangle triangle;

    public Triangle getTriangle() {
        return triangle;
    }

    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    private Circle circle;
}
