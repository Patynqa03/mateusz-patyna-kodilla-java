package com.kodilla.testing.shape;

import com.kodilla.testing.forum.ForumComment;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {


    private List <Shape> shapes = new ArrayList<>();



    public void addFigure(Shape shape) {

        shapes.add(shape);


    }

    public void removeFigure(Shape shape) {

        shapes.remove(shape);


    }

    public Shape getFigure(int n) {

        Shape theShape = null;
        if (n >= 0 && n < shapes.size()) {
            theShape = shapes.get(n);
        }
        return theShape;

    }


    public List showFigures(){

        return shapes;

    }




}
