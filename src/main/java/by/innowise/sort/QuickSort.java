package by.innowise.sort;

import by.innowise.models.Ball;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class QuickSort {
    public static void quickSortByField(List<Ball> list, int left, int right, Function<Ball, Integer> field) {
        if (left < right) {
            int pivotIndex = partition(list, left, right, field);
            quickSortByField(list, left, pivotIndex - 1, field);
            quickSortByField(list, pivotIndex + 1, right, field);
        }
    }

    private static int partition(List<Ball> list, int left, int right, Function<Ball, Integer> field) {
        Ball pivot = list.get(right);
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (field.apply(list.get(j)) < field.apply(pivot)) {
                i++;
                Collections.swap(list, i, j);
            }
        }
        Collections.swap(list, i + 1, right);
        return i + 1;
    }
}
