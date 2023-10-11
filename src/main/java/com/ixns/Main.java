package com.ixns;

import com.ixns.factory.AbstractFactory;
import com.ixns.factory.FactoryProducer;
import com.ixns.shapes.Shape;

public class Main {
    public static void main(String[] args) {
        AbstractFactory roundShapeFactory = FactoryProducer.getFactory(true);
        Shape roundSquare = roundShapeFactory.getShape("square");
        roundSquare.draw();
        Shape roundRectangle = roundShapeFactory.getShape("rectangle");
        roundRectangle.draw();
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        Shape square = shapeFactory.getShape("square");
        square.draw();
        Shape rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();
    }
}