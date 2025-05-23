package com.controller.editor.model;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height, String color) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    public int getWidth() { return width; }
    public int getHeight() { return height; }
    public void setWidth(int width) { this.width = width; }
    public void setHeight(int height) { this.height = height; }

    @Override
    public String getType() {
        return "Rectangle";
    }
}