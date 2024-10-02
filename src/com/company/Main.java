package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        CarDealershipSingleton carDealershipSingleton = CarDealershipSingleton.getInstance();

        Car car1 = Car.builder().addEngine(1.4).addColor(" Black ").addWheels("Sport").build();

        Car car2 = Car.builder().addEngine(2.0).addColor(" Blue ").addWheels("Sport").build();

        carDealershipSingleton.orderCar(car1);
        carDealershipSingleton.orderCar(car2);
        carDealershipSingleton.printOrders();
    }
}
