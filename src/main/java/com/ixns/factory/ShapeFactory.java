package com.ixns.factory;

import com.ixns.shapes.Rectangle;
import com.ixns.shapes.Shape;
import com.ixns.shapes.Square;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        shapeType = shapeType.toUpperCase();
        return switch (shapeType) {
            case "SQUARE" -> new Square();
            case "RECTANGLE" -> new Rectangle();
            default -> null;
        };
    }
}
