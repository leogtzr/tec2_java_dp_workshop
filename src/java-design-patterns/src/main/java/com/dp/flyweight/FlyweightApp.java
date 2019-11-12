package com.dp.flyweight;

import com.dp.flyweight.domain.Shape;
import com.dp.flyweight.domain.ShapeFactory;

public class FlyweightApp {
    public static void main(final String[] args) {
        final ShapeFactory factory = new ShapeFactory();
        final Shape shape1 = factory.get("red");
        final Shape shape2 = factory.get("red");

        System.out.println(shape1 + " <~~> " + shape2);
    }
}
