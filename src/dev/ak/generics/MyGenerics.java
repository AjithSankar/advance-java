package dev.ak.generics;

import java.util.ArrayList;
import java.util.List;

class MyGenerics<E> {

    List<E> elements = new ArrayList<>();

    public E add(E element) {
        elements.add(element);
        return element;
    }

    public <T> void add(List<T> list, T element) {
        list.add(element);
    }
}
