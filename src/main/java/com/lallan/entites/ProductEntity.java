package com.lallan.entites;

import javax.persistence.*;

@Entity
//@Table(name = "product")
public class ProductEntity {
 @Id
 @GeneratedValue
    private Long id;
    private  String name;
    private   String brand;
    private   String  madeIn;
    private  double price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        String sb = "ProductEntity{" + "id=" + id +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", madeIn='" + madeIn + '\'' +
                ", price=" + price +
                '}';
        return sb;
    }
}
