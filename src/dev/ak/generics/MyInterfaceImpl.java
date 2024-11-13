package dev.ak.generics;

public class MyInterfaceImpl implements MyInterface<Truck> {


    @Override
    public Truck createInstance(Class<Truck> class_) throws InstantiationException, IllegalAccessException {
        return class_.newInstance();
    }
}
