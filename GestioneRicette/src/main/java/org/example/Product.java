package org.example;

public class Product {
    private String name ;
    private double price ;

    public Product(String name, double price) {
        this.setName(name);
        this.setPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!(name.equals("")))
            this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price>0)
            this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
