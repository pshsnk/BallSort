package by.innowise.models;

import by.innowise.types.BallType;
import by.innowise.types.Color;
import java.util.Objects;

public class Ball {

    private Integer price;
    private Integer size;
    private Color color;
    private BallType classOrder;


    public Ball(Integer size, Color color, Integer price, BallType classOrder) {
        if (size == null || color == null || price == null || classOrder == null) {
            throw new IllegalArgumentException("Field cannot be null");
        }
            this.size = size;
            this.color = color;
            this.price = price;
            this.classOrder=classOrder;
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        if (color == null) {
            throw new IllegalArgumentException("Field cannot be null");
        }
        this.color = color;
    }

    public BallType getClassOrder() {
        return classOrder;
    }

    public void setClassOrder(BallType classOrder) {
        this.classOrder = classOrder;
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
