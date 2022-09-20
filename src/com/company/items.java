package com.company;

public class items {
    String name;
    Double price;

    public items(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "items{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
