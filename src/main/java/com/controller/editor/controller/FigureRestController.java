package com.controller.editor.controller;

import com.controller.editor.model.Figure;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/figures")
@CrossOrigin(origins = "*") 
public class FigureRestController {

    private final List<Figure> figures = new ArrayList<>();

    @PostMapping
    public void addFigure(@RequestBody Figure figure) {
        figures.add(figure);
    }

    @GetMapping
    public List<Figure> getAllFigures() {
        return figures;
    }
}
