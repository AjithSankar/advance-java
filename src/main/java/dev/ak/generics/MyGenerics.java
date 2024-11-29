package dev.ak.generics;

import java.util.List;

public class MyGenerics<E> {

    public <T> void add(T element, List<T> list) {
        list.add(element);
    }

    public <T> T addAndReturn(T element, List<T> list) {
        list.add(element);
        return element;
    }

}
