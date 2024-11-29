package dev.ak.generics;

public class Truck {

    private Integer id;
    private Integer capacity;
    private Integer wheels;

    public Truck(Integer id, Integer capacity, Integer wheels) {
        this.id = id;
        this.capacity = capacity;
        this.wheels = wheels;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getWheels() {
        return wheels;
    }

    public void setWheels(Integer wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "id=" + id +
                ", capacity=" + capacity +
                ", wheels=" + wheels +
                '}';
    }
}
