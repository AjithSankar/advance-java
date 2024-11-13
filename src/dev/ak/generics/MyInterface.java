package dev.ak.generics;

public interface MyInterface<T> {

    T createInstance(Class<T> class_) throws InstantiationException, IllegalAccessException;

}
