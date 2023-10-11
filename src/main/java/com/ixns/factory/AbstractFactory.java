package com.ixns.factory;

import com.ixns.shapes.Shape;

public abstract class AbstractFactory {
    public abstract Shape getShape(String shapeType);
}
