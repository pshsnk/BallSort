package by.innowise.services;

import by.innowise.models.Ball;
import by.innowise.sort.MergeSort;
import by.innowise.sort.QuickSort;

import java.util.List;

public class SortService {

    public static void mergeSortByPrice(List<Ball> ballList){
        MergeSort.mergeSortByField(ballList, Ball::getPrice);
    }

    public static void mergeSortBySize(List<Ball> ballList){
        MergeSort.mergeSortByField(ballList, Ball::getSize);
    }

    public static void mergeSortByClassType(List<Ball> ballList){
        MergeSort.mergeSortByField(ballList, ball -> ball.getClassOrder().ordinal());
    }

    public static  void mergeSortByColor(List<Ball> ballList){
        MergeSort.mergeSortByField(ballList, ball -> ball.getColor().ordinal());
    }

    public static  void quickSortByPrice(List<Ball> ballList){
        QuickSort.quickSortByField(ballList, 0, ballList.size()-1, Ball::getPrice);
    }

    public static  void quickSortBySize(List<Ball> ballList){
        QuickSort.quickSortByField(ballList, 0, ballList.size()-1, Ball::getSize);
    }

    public static  void quickSortByClassType(List<Ball> ballList){
        QuickSort.quickSortByField(ballList, 0, ballList.size()-1, ball -> ball.getClassOrder().ordinal());
    }

    public static  void quickSortByColor(List<Ball> ballList){
        QuickSort.quickSortByField(ballList, 0, ballList.size()-1, ball -> ball.getColor().ordinal());
    }

}
