package com.codegym;

public class TestStaticProperty {

    public static void main(String[] args) {
	// write your code here
        Car car = new Car("Madza 3","Skyactiv 3");
        System.out.println(Car.numberOfCar);
        Car car2 = new Car("Madza 6","Skyactiv 6");
        System.out.println(Car.numberOfCar);
    }
}
