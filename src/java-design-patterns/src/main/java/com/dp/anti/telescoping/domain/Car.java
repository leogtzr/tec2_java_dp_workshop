package com.dp.anti.telescoping.domain;

public class Car {

    private int numberOfDoors;
    private int cylinders;
    private String model;
    private int year;

    public Car() {}

    public Car(final int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public Car(final int numberOfDoors, final int cylinders) {
        this.numberOfDoors = numberOfDoors;
        this.cylinders = cylinders;
    }

    public Car(final int numberOfDoors, final int cylinders, final String model) {
        this.numberOfDoors = numberOfDoors;
        this.cylinders = cylinders;
        this.model = model;
    }

    public Car(final int numberOfDoors, final int cylinders, final String model, final int year) {
        this.numberOfDoors = numberOfDoors;
        this.cylinders = cylinders;
        this.model = model;
        this.year = year;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfDoors=" + numberOfDoors +
                ", cylinders=" + cylinders +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}