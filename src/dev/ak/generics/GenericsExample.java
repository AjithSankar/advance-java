package dev.ak.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

    public static void main(String[] args) {

        MyGenerics<String> generics = new MyGenerics<>();

        List<Car> cars = new ArrayList<>();
        Car car = new Car(1);
        generics.add(cars,car);

        List<Truck> trucks = new ArrayList<>();
        Truck truck = new Truck(1);
        generics.add(trucks, truck);

        MyGenerics<Truck> generics1 = new MyGenerics<>();
        Truck truck1 = generics1.add(new Truck(1));

    }
}

