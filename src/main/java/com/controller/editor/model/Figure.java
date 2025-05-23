package com.controller.editor.model;

public abstract class Figure {
    protected int x;
    protected int y;
    protected String color;

    public Figure(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public abstract String getType();

    public int getX() { return x; }
    public int getY() { return y; }
    public String getColor() { return color; }

    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }
    public void setColor(String color) { this.color = color; }
}
