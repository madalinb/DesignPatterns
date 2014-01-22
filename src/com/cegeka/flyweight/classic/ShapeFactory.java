package com.cegeka.flyweight.classic;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private static final Map<String, Shape> shapes = new HashMap<String, Shape>();

    public static Shape getShape(String shapeType) {
        Shape shape = null;
        if (shapeType.equalsIgnoreCase("circle")) {

            shape = (Circle) shapes.get("circle");

            if (shape == null) {
                shape = new Circle();
                shapes.put("circle", shape);
                System.out.println("Circle " + shape + " was created!");
            }
        }
        return shape;
    }
}
