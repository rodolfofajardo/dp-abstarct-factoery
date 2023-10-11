package com.ixns.factory;

import com.ixns.shapes.*;

public class RoundShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        shapeType = shapeType.toUpperCase();
        return switch (shapeType) {
            case "SQUARE" -> new RoundSquare();
            case "RECTANGLE" -> new RoundRectangle();
            default -> null;
        };
    }
}
