package model;

import java.util.Objects;
import java.util.Random;

public class Product {
    private final int key;
    private final String name;
    private final int price;

    public Product(String name, int price) {
        this.key = new Random().nextInt(1000);
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

