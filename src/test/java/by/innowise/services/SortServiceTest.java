package by.innowise.services;

import by.innowise.basket.Basket;
import by.innowise.models.*;
import by.innowise.orders.ColorOrder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class SortServiceTest {

    private List<Ball> actualBalls;
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
        basket.setBallList(actualBalls);
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
        SortService.mergeSortByPrice(actualBalls);
        actualBalls=basket.getBallList();
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
        SortService.mergeSortBySize(actualBalls);
        actualBalls=basket.getBallList();
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
        SortService.mergeSortByClassType(actualBalls);
        actualBalls=basket.getBallList();
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
        SortService.mergeSortByColor(actualBalls);
        actualBalls=basket.getBallList();
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
        SortService.quickSortByPrice(actualBalls);
        actualBalls=basket.getBallList();
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
        SortService.quickSortBySize(actualBalls);
        actualBalls=basket.getBallList();
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
        SortService.quickSortByClassType(actualBalls);
        actualBalls=basket.getBallList();
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
        SortService.quickSortByColor(actualBalls);
        actualBalls=basket.getBallList();
        Assertions.assertEquals(expectedBalls, actualBalls);
    }
}