package by.innowise.services;

import by.innowise.models.Ball;
import java.util.ArrayList;
import java.util.function.Function;

public class SortService {
    public static void mergeSortByField(ArrayList<Ball> array, Function<Ball, Integer> field) {
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

    private static void mergeByField(ArrayList<Ball> array, ArrayList<Ball> leftArr, ArrayList<Ball> rightArr,
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



    public static void quickSortByField(ArrayList<Ball> list, int left, int right, Function<Ball, Integer> field) {
        if (left < right) {
            int pivotIndex = partition(list, left, right, field);
            quickSortByField(list, left, pivotIndex - 1, field);
            quickSortByField(list, pivotIndex + 1, right, field);
        }
    }

    private static int partition(ArrayList<Ball> list, int left, int right, Function<Ball, Integer> field) {
        Ball pivot = list.get(right);
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (field.apply(list.get(j)) < field.apply(pivot)) {
                i++;
                swap(list, i, j);
            }
        }
        swap(list, i + 1, right);
        return i + 1;
    }

    private static void swap(ArrayList<Ball> list, int i, int j) {
        Ball temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }



}
