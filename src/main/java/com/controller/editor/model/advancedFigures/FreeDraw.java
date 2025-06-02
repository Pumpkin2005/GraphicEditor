package com.controller.editor.model.advancedFigures;
import com.controller.editor.model.Figure;
import java.util.ArrayList;
import java.util.List;

public class FreeDraw extends Figure {
    private final List<Integer> xPoints = new ArrayList<>();
    private final List<Integer> yPoints = new ArrayList<>();

    public FreeDraw(String color) {
        super(0, 0, color); // x, y можна не використовувати
    }

    public void addPoint(int x, int y) {
        xPoints.add(x);
        yPoints.add(y);
    }

    public List<Integer> getXPoints() {
        return xPoints;
    }

    public List<Integer> getYPoints() {
        return yPoints;
    }

    @Override
    public String getType() {
        return "freedraw";
    }
}
