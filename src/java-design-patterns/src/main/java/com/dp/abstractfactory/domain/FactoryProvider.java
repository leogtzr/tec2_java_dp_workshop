package com.dp.abstractfactory.domain;

public class FactoryProvider {

    private FactoryProvider() {}

    public static AbstractFactory<Shape> getFactory(final String type) {
        switch (type) {
            case "2":
                return new Factory2D();
            case "3":
                return new Factory3D();
        }
        return null;
    }
}
