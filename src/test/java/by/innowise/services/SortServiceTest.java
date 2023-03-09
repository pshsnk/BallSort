package by.innowise.services;

import by.innowise.basket.Basket;
import by.innowise.models.*;
import by.innowise.types.BallType;
import by.innowise.types.Color;
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
                new Ball(12, Color.GREEN, 40, BallType.FOOTBALL),
                new Ball(10, Color.ORANGE, 90, BallType.VOLLEYBALL),
                new Ball(25, Color.YELLOW, 35, BallType.BASKETBALL),
                new Ball(22, Color.BLACK, 25, BallType.TENNIS),
                new Ball(15, Color.PINK, 30, BallType.HANDBALL)
        ));
        basket.setBallList(actualBalls);
    }


    @Test
    void testMergeSortByPrice() {
        ArrayList<Ball> expectedBalls = new ArrayList<>(Arrays.asList(
                new Ball(22, Color.BLACK, 25, BallType.TENNIS),
                new Ball(15, Color.PINK, 30, BallType.HANDBALL),
                new Ball(25, Color.YELLOW, 35, BallType.BASKETBALL),
                new Ball(12, Color.GREEN, 40, BallType.FOOTBALL),
                new Ball(10, Color.ORANGE, 90, BallType.VOLLEYBALL)
        ));
        SortService.mergeSortByPrice(actualBalls);
        actualBalls=basket.getBallList();
        Assertions.assertEquals(expectedBalls, actualBalls);
    }

    @Test
    void testMergeSortBySize() {
        ArrayList<Ball> expectedBalls = new ArrayList<>(Arrays.asList(
                new Ball(10, Color.ORANGE, 90, BallType.VOLLEYBALL),
                new Ball(12, Color.GREEN, 40, BallType.FOOTBALL),
                new Ball(15, Color.PINK, 30, BallType.HANDBALL),
                new Ball(22, Color.BLACK, 25, BallType.TENNIS),
                new Ball(25, Color.YELLOW, 35, BallType.BASKETBALL)
        ));
        SortService.mergeSortBySize(actualBalls);
        actualBalls=basket.getBallList();
        Assertions.assertEquals(expectedBalls, actualBalls);
    }

    @Test
    void testMergeSortByClassType() {
        ArrayList<Ball> expectedBalls = new ArrayList<>(Arrays.asList(
                new Ball(25, Color.YELLOW, 35, BallType.BASKETBALL),
                new Ball(12, Color.GREEN, 40, BallType.FOOTBALL),
                new Ball(15, Color.PINK, 30, BallType.HANDBALL),
                new Ball(22, Color.BLACK, 25, BallType.TENNIS),
                new Ball(10, Color.ORANGE, 90, BallType.VOLLEYBALL)

        ));
        SortService.mergeSortByClassType(actualBalls);
        actualBalls=basket.getBallList();
        Assertions.assertEquals(expectedBalls, actualBalls);
    }

    @Test
    void testMergeSortByColor() {
        ArrayList<Ball> expectedBalls = new ArrayList<>(Arrays.asList(
                new Ball(22, Color.BLACK, 25, BallType.TENNIS),
                new Ball(25, Color.YELLOW, 35, BallType.BASKETBALL),
                new Ball(12, Color.GREEN, 40, BallType.FOOTBALL),
                new Ball(15, Color.PINK, 30, BallType.HANDBALL),
                new Ball(10, Color.ORANGE, 90, BallType.VOLLEYBALL)

        ));
        SortService.mergeSortByColor(actualBalls);
        actualBalls=basket.getBallList();
        Assertions.assertEquals(expectedBalls, actualBalls);
    }

    @Test
    void testQuickSortByPrice() {
        ArrayList<Ball> expectedBalls = new ArrayList<>(Arrays.asList(
                new Ball(22, Color.BLACK, 25, BallType.TENNIS),
                new Ball(15, Color.PINK, 30, BallType.HANDBALL),
                new Ball(25, Color.YELLOW, 35, BallType.BASKETBALL),
                new Ball(12, Color.GREEN, 40, BallType.FOOTBALL),
                new Ball(10, Color.ORANGE, 90, BallType.VOLLEYBALL)
        ));
        SortService.quickSortByPrice(actualBalls);
        actualBalls=basket.getBallList();
        Assertions.assertEquals(expectedBalls, actualBalls);
    }

    @Test
    void testQuickSortBySize() {
        ArrayList<Ball> expectedBalls = new ArrayList<>(Arrays.asList(
                new Ball(10, Color.ORANGE, 90, BallType.VOLLEYBALL),
                new Ball(12, Color.GREEN, 40, BallType.FOOTBALL),
                new Ball(15, Color.PINK, 30, BallType.HANDBALL),
                new Ball(22, Color.BLACK, 25, BallType.TENNIS),
                new Ball(25, Color.YELLOW, 35, BallType.BASKETBALL)
        ));
        SortService.quickSortBySize(actualBalls);
        actualBalls=basket.getBallList();
        Assertions.assertEquals(expectedBalls, actualBalls);
    }

    @Test
    void testQuickSortByClassType() {
        ArrayList<Ball> expectedBalls = new ArrayList<>(Arrays.asList(
                new Ball(25, Color.YELLOW, 35, BallType.BASKETBALL),
                new Ball(12, Color.GREEN, 40, BallType.FOOTBALL),
                new Ball(15, Color.PINK, 30, BallType.HANDBALL),
                new Ball(22, Color.BLACK, 25, BallType.TENNIS),
                new Ball(10, Color.ORANGE, 90, BallType.VOLLEYBALL)

        ));
        SortService.quickSortByClassType(actualBalls);
        actualBalls=basket.getBallList();
        Assertions.assertEquals(expectedBalls, actualBalls);
    }

    @Test
    void testQuickSortByColor() {
        ArrayList<Ball> expectedBalls = new ArrayList<>(Arrays.asList(
                new Ball(22, Color.BLACK, 25, BallType.TENNIS),
                new Ball(25, Color.YELLOW, 35, BallType.BASKETBALL),
                new Ball(12, Color.GREEN, 40, BallType.FOOTBALL),
                new Ball(15, Color.PINK, 30, BallType.HANDBALL),
                new Ball(10, Color.ORANGE, 90, BallType.VOLLEYBALL)

        ));
        SortService.quickSortByColor(actualBalls);
        actualBalls=basket.getBallList();
        Assertions.assertEquals(expectedBalls, actualBalls);
    }
}