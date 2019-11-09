package com.dp.anti.telescoping;

import com.dp.anti.telescoping.domain.Car;

public class TelescopingApp {

    public static void main(final String[] args) {
        final Car mazda = new Car();
        final Car mx5 = new Car(4);
        // numberOfDoors and then cylinders?
        // or cylinders and then numberOfDoors?
        // What is the right order? ...
        final Car audi = new Car(4, 2);
    }
}