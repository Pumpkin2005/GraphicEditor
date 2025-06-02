package com.controller.editor.model.baseFigures;

import com.controller.editor.model.Figure;

public class Line extends Figure {
    private int x2;
    private int y2;

    public Line(int x, int y, int x2, int y2, String color) {
        super(x, y, color);
        this.x2 = x2;
        this.y2 = y2;
    }

    public int getX2() { return x2; }
    public int getY2() { return y2; }
    public void setX2(int x2) { this.x2 = x2; }
    public void setY2(int y2) { this.y2 = y2; }

    @Override
    public String getType() {
        return "Line";
    }
}
