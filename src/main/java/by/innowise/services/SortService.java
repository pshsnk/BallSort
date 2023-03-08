package by.innowise.services;

import by.innowise.models.Ball;
import by.innowise.orders.ClassOrder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class SortService {

    public static void mergeSortByPrice(List<Ball> ballList){
        MergeSort.mergeSortByField(ballList, ball -> ball.getPrice());
    }

    public static void mergeSortBySize(List<Ball> ballList){
        MergeSort.mergeSortByField(ballList, ball -> ball.getSize());
    }

    public static void mergeSortByClassType(List<Ball> ballList){
        MergeSort.mergeSortByField(ballList, ball -> ClassOrder.findByKey(ball.getClass()).ordinal());
    }

    public static  void mergeSortByColor(List<Ball> ballList){
        MergeSort.mergeSortByField(ballList, ball -> ball.getColor().ordinal());
    }

    public static  void quickSortByPrice(List<Ball> ballList){
        QuickSort.quickSortByField(ballList, 0, ballList.size()-1, ball -> ball.getPrice());
    }

    public static  void quickSortBySize(List<Ball> ballList){
        QuickSort.quickSortByField(ballList, 0, ballList.size()-1, ball -> ball.getSize());
    }

    public static  void quickSortByClassType(List<Ball> ballList){
        QuickSort.quickSortByField(ballList, 0, ballList.size()-1, ball -> ClassOrder.findByKey(ball.getClass()).ordinal());
    }

    public static  void quickSortByColor(List<Ball> ballList){
        QuickSort.quickSortByField(ballList, 0, ballList.size()-1, ball -> ball.getColor().ordinal());
    }

}
