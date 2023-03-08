package by.innowise.models;

import by.innowise.enums.ColorOrder;
import java.util.Objects;

public abstract class Ball {

    protected Integer price;
    protected Integer size;
    protected ColorOrder color;

    public Ball(Integer size, ColorOrder color, Integer price) {
        if (size == null || color == null || price == null) {
            throw new IllegalArgumentException("Field cannot be null");
        }
            this.size = size;
            this.color = color;
            this.price = price;
    }

    public Integer getPrice() {return price;}

    public void setPrice(Integer price) {
        if (price == null) {
            throw new IllegalArgumentException("Field cannot be null");
        }
        this.price = price;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        if (size == null) {
            throw new IllegalArgumentException("Field cannot be null");
        }
        this.size = size;
    }

    public ColorOrder getColor() {
        return color;
    }

    public void setColor(ColorOrder color) {
        if (color == null) {
            throw new IllegalArgumentException("Field cannot be null");
        }
        this.color = color;
    }

    @Override
    public String toString(){
        return "size: " + size+" " +
                "color "+ color+" " +
                "price "+ price+ " " +
                    this.getClass();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Ball ball = (Ball) o;
        return size == ball.size && color == ball.color && price == ball.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, color, price);
    }



}
