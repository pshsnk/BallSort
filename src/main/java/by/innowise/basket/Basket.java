package by.innowise.basket;

import by.innowise.balls.Ball;
import by.innowise.enums.ClassOrder;
import by.innowise.sort.Sorter;
import java.util.ArrayList;


public class Basket {
    private ArrayList<Ball> balls = new ArrayList<>();

    public Basket(){

    }

    public void addBall(Ball ball) {
        if(ball!=null)
        balls.add(ball);
    }

    public ArrayList<Ball> getBalls() {
        return balls;
    }

    public void setBalls(ArrayList<Ball> balls) {
        if(balls!=null)
        this.balls = balls;
    }

    public void mergeSortByPrice(){
        Sorter.mergeSortByField(balls, ball -> ball.getPrice());
    }

    public void mergeSortBySize(){
        Sorter.mergeSortByField(balls, ball -> ball.getSize());
    }

    public void mergeSortByClassType(){
        Sorter.mergeSortByField(balls, ball -> ClassOrder.findByKey(ball.getClass()).ordinal());
    }

    public void mergeSortByColor(){
        Sorter.mergeSortByField(balls, ball -> ball.getColor().ordinal());
    }
}

