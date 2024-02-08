package oops_07th_Jan_2024.inheritance.heirarchial;

public class Vehicle {
    Vehicle() {
        System.out.println("Vehicle DC");
    }

    void vehicleHasTopSpeed() {
        System.out.println("Yeah from " + getClass().getSimpleName());
    }
}
