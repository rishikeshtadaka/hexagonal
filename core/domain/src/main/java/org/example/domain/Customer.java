package org.example.domain;

public class Customer {
    private String name;
    private int id;
    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
