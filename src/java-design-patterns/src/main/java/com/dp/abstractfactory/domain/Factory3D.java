package com.dp.abstractfactory.domain;

public class Factory3D implements AbstractFactory<Shape> {
    @Override
    public Shape create(final String type) {
        switch (type)  {
            case "square":
                return new Square2D();
            case "rectangle":
                return new Rectangle2D();
        }
        return null;
    }
}
