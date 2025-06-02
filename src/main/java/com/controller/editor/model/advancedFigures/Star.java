package com.controller.editor.model.advancedFigures;

import com.controller.editor.model.Figure;

public class Star extends Figure {
    public Star(int x, int y, String color) {
        super(x, y, color);
    }

    @Override
    public String getType() {
        return "star";
    }
}
