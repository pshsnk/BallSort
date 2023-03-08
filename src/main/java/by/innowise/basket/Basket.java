package by.innowise.basket;

import by.innowise.models.Ball;

import java.util.ArrayList;
import java.util.List;


public class Basket {
    private List<Ball> ballList;

    public Basket(){
        ballList =new ArrayList<>();
    }

    public void addBall(Ball ball) {
        if(ball!=null)
        ballList.add(ball);
    }

    public List<Ball> getBallList() {
        return ballList;
    }

    public void setBallList(List<Ball> ballList) {
        if(ballList !=null)
        this.ballList = ballList;
    }
}

