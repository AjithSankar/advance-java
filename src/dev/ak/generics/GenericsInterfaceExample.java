package dev.ak.generics;

public class GenericsInterfaceExample {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        MyInterface<Truck> myInterface = new MyInterfaceImpl();
        //MyInterface<Car> myInterface1 = new MyInterfaceImpl<>();

        Truck truck = myInterface.createInstance(Truck.class);
        System.out.println(truck);
        //Car car = myInterface1.createInstance(Car.class);
    }
}
