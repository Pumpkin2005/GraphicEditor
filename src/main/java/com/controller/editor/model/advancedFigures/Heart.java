package com.controller.editor.model.advancedFigures;

import com.controller.editor.model.Figure;

public class Heart extends Figure {
    public Heart(int x, int y, String color) {
        super(x, y, color);
    }

    @Override
    public String getType() {
        return "heart";
    }
}
