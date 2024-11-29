package dev.ak.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExamples {

    public static void main(String[] args) {

        MyGenerics<String> generics = new MyGenerics<>();

        List<Car> cars = new ArrayList<>();
        Car car = new Car("tata", 1);
        generics.add(car,cars);

        List<Truck> trucks = new ArrayList<>();
        Truck truck = new Truck(1,1000,10);
        generics.add(truck,trucks);
        Truck truck1 = generics.addAndReturn(truck,trucks);

    }
}
