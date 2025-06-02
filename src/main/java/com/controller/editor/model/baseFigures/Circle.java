package com.controller.editor.model.baseFigures;

import com.controller.editor.model.Figure;

public class Circle extends Figure {
    private int radius;

    public Circle(int x, int y, int radius, String color) {
        super(x, y, color);
        this.radius = radius;
    }

    public int getRadius() { return radius; }
    public void setRadius(int radius) { this.radius = radius; }

    @Override
    public String getType() {
        return "Circle";
    }
}
