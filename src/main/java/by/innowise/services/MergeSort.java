package by.innowise.services;

import by.innowise.models.Ball;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MergeSort {

    public static void mergeSortByField(List<Ball> array, Function<Ball, Integer> field) {
        if (array.size() > 1) {
            ArrayList<Ball> leftPart = new ArrayList<>(array.subList(0, array.size()/2));
            ArrayList<Ball> rightPart = new ArrayList<>(array.subList(array.size()/2, array.size()));

            Thread leftThread = new Thread(){
                @Override
                public void run() {
                    mergeSortByField(leftPart, field);
                }
            };
            Thread rightThread = new Thread() {
                @Override
                public void run() {
                    mergeSortByField(rightPart, field);
                }
            };
            leftThread.start();
            rightThread.start();

            try {
                leftThread.join();
                rightThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            mergeByField(array, leftPart, rightPart, field);
        }
    }

    private static void mergeByField(List<Ball> array, ArrayList<Ball> leftArr, ArrayList<Ball> rightArr,
                                     Function<Ball, Integer> field) {
        int leftIndex = 0;
        int rightIndex = 0;
        int arrIndex = 0;

        while (leftIndex < leftArr.size() && rightIndex < rightArr.size()) {
            if (field.apply(leftArr.get(leftIndex)) < field.apply(rightArr.get(rightIndex))) {
                array.set(arrIndex, leftArr.get(leftIndex));
                leftIndex++;
            } else {
                array.set(arrIndex, rightArr.get(rightIndex));
                rightIndex++;
            }
            arrIndex++;
        }
        while (leftIndex < leftArr.size()) {
            array.set(arrIndex, leftArr.get(leftIndex));
            leftIndex++;
            arrIndex++;
        }

        while (rightIndex < rightArr.size()) {
            array.set(arrIndex, rightArr.get(rightIndex));
            rightIndex++;
            arrIndex++;
        }
    }
}
