package com.controller.editor.model.baseFigures;

import com.controller.editor.model.Figure;

public class Square extends Figure {
    private int size;

    public Square(int x, int y, int size, String color) {
        super(x, y, color);
        this.size = size;
    }

    public int getSize() { return size; }
    public void setSize(int size) { this.size = size; }

    @Override
    public String getType() {
        return "Square";
    }
}