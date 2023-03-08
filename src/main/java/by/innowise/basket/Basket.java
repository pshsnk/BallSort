package by.innowise.basket;

import by.innowise.models.Ball;
import by.innowise.enums.ClassOrder;
import by.innowise.services.SortService;
import java.util.ArrayList;


public class Basket {
    private ArrayList<Ball> balls;

    public Basket(){
        balls=new ArrayList<>();
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
        SortService.mergeSortByField(balls, ball -> ball.getPrice());
    }

    public void mergeSortBySize(){
        SortService.mergeSortByField(balls, ball -> ball.getSize());
    }

    public void mergeSortByClassType(){
        SortService.mergeSortByField(balls, ball -> ClassOrder.findByKey(ball.getClass()).ordinal());
    }

    public void mergeSortByColor(){
        SortService.mergeSortByField(balls, ball -> ball.getColor().ordinal());
    }

    public void quickSortByPrice(){
        SortService.quickSortByField(balls, 0, balls.size()-1, ball -> ball.getPrice());
    }

    public void quickSortBySize(){
        SortService.quickSortByField(balls, 0, balls.size()-1, ball -> ball.getSize());
    }

    public void quickSortByClassType(){
        SortService.quickSortByField(balls, 0, balls.size()-1, ball -> ClassOrder.findByKey(ball.getClass()).ordinal());
    }

    public void quickSortByColor(){
        SortService.quickSortByField(balls, 0, balls.size()-1, ball -> ball.getColor().ordinal());
    }
}

