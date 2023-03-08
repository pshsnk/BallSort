package by.innowise.basket;

import by.innowise.models.*;
import by.innowise.enums.ColorOrder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;


class BasketTest {
    private  ArrayList<Ball> actualBalls;
    private static Basket basket;

    @BeforeAll
    static void beforeAll() {
        basket = new Basket();
    }

    @BeforeEach
    void setUp() {
        actualBalls = new ArrayList<>(Arrays.asList(
                new FootballBall(12, ColorOrder.GREEN, 40),
                new VolleyballBall(10, ColorOrder.ORANGE, 90),
                new BasketballBall(25, ColorOrder.YELLOW, 35),
                new TennisBall(22, ColorOrder.BLACK, 25),
                new HandballBall(15, ColorOrder.PINK, 30)
        ));
        basket.setBalls(actualBalls);
    }


    @Test
    void mergeSortByPrice() {
        ArrayList<Ball> expectedBalls = new ArrayList<>(Arrays.asList(
                new TennisBall(22, ColorOrder.BLACK, 25),
                new HandballBall(15, ColorOrder.PINK, 30),
                new BasketballBall(25, ColorOrder.YELLOW, 35),
                new FootballBall(12, ColorOrder.GREEN, 40),
                new VolleyballBall(10, ColorOrder.ORANGE, 90)
        ));
        basket.mergeSortByPrice();
        actualBalls=basket.getBalls();
        Assertions.assertEquals(expectedBalls, actualBalls);
    }

    @Test
    void mergeSortBySize() {
        ArrayList<Ball> expectedBalls = new ArrayList<>(Arrays.asList(
                new VolleyballBall(10, ColorOrder.ORANGE, 90),
                new FootballBall(12, ColorOrder.GREEN, 40),
                new HandballBall(15, ColorOrder.PINK, 30),
                new TennisBall(22, ColorOrder.BLACK, 25),
                new BasketballBall(25, ColorOrder.YELLOW, 35)
        ));
        basket.mergeSortBySize();
        actualBalls=basket.getBalls();
        Assertions.assertEquals(expectedBalls, actualBalls);
    }

    @Test
    void mergeSortByClassType() {
        ArrayList<Ball> expectedBalls = new ArrayList<>(Arrays.asList(
                new BasketballBall(25, ColorOrder.YELLOW, 35),
                new FootballBall(12, ColorOrder.GREEN, 40),
                new HandballBall(15, ColorOrder.PINK, 30),
                new TennisBall(22, ColorOrder.BLACK, 25),
                new VolleyballBall(10, ColorOrder.ORANGE, 90)

        ));
        basket.mergeSortByClassType();
        actualBalls=basket.getBalls();
        Assertions.assertEquals(expectedBalls, actualBalls);
    }

    @Test
    void mergeSortByColor() {
        ArrayList<Ball> expectedBalls = new ArrayList<>(Arrays.asList(
                new TennisBall(22, ColorOrder.BLACK, 25),
                new BasketballBall(25, ColorOrder.YELLOW, 35),
                new FootballBall(12, ColorOrder.GREEN, 40),
                new HandballBall(15, ColorOrder.PINK, 30),
                new VolleyballBall(10, ColorOrder.ORANGE, 90)

        ));
        basket.mergeSortByColor();
        actualBalls=basket.getBalls();
        Assertions.assertEquals(expectedBalls, actualBalls);
    }

    @Test
    void quickSortByPrice() {
        ArrayList<Ball> expectedBalls = new ArrayList<>(Arrays.asList(
                new TennisBall(22, ColorOrder.BLACK, 25),
                new HandballBall(15, ColorOrder.PINK, 30),
                new BasketballBall(25, ColorOrder.YELLOW, 35),
                new FootballBall(12, ColorOrder.GREEN, 40),
                new VolleyballBall(10, ColorOrder.ORANGE, 90)
        ));
        basket.quickSortByPrice();
        actualBalls=basket.getBalls();
        Assertions.assertEquals(expectedBalls, actualBalls);
    }

    @Test
    void quickSortBySize() {
        ArrayList<Ball> expectedBalls = new ArrayList<>(Arrays.asList(
                new VolleyballBall(10, ColorOrder.ORANGE, 90),
                new FootballBall(12, ColorOrder.GREEN, 40),
                new HandballBall(15, ColorOrder.PINK, 30),
                new TennisBall(22, ColorOrder.BLACK, 25),
                new BasketballBall(25, ColorOrder.YELLOW, 35)
        ));
        basket.quickSortBySize() ;
        actualBalls=basket.getBalls();
        Assertions.assertEquals(expectedBalls, actualBalls);
    }

    @Test
    void quickSortByClassType() {
        ArrayList<Ball> expectedBalls = new ArrayList<>(Arrays.asList(
                new BasketballBall(25, ColorOrder.YELLOW, 35),
                new FootballBall(12, ColorOrder.GREEN, 40),
                new HandballBall(15, ColorOrder.PINK, 30),
                new TennisBall(22, ColorOrder.BLACK, 25),
                new VolleyballBall(10, ColorOrder.ORANGE, 90)

        ));
        basket.quickSortByClassType();
        actualBalls=basket.getBalls();
        Assertions.assertEquals(expectedBalls, actualBalls);
    }

    @Test
    void quickSortByColor() {
        ArrayList<Ball> expectedBalls = new ArrayList<>(Arrays.asList(
                new TennisBall(22, ColorOrder.BLACK, 25),
                new BasketballBall(25, ColorOrder.YELLOW, 35),
                new FootballBall(12, ColorOrder.GREEN, 40),
                new HandballBall(15, ColorOrder.PINK, 30),
                new VolleyballBall(10, ColorOrder.ORANGE, 90)

        ));
        basket.quickSortByColor();
        actualBalls=basket.getBalls();
        Assertions.assertEquals(expectedBalls, actualBalls);
    }

}