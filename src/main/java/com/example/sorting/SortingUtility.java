package com.example.sorting;

public class SortingUtility {


    public static <T extends Comparable<T>> void gnomeSort(T[] a) {
        int pos = 0;
        while (pos < a.length) {
            if (pos == 0 || a[pos].compareTo(a[pos - 1]) >= 0) {
                pos++;
            } else {
                swap(a, pos, pos - 1);
                pos--;
            }
        }
    }


    public static <T extends Comparable<T>> void cocktailShakerSort(T[] a) {

        // TODO implement Cocktail Shaker Sort here
        int left = 0;
        int right = a.length - 1;
        boolean swapped = true;

        while (swapped) {
            swapped = false;

            // Forward pass
            for (int i = left; i < right; i++) {
                if (a[i].compareTo(a[i + 1]) > 0) {
                    swap(a, i, i + 1);
                    swapped = true;
                }
            }
            right--;
    }


    public static <T extends Comparable<T>> void shellSort(T[] a) {

        // TODO implement Shell Sort here
            int gap = a.length / 2;
            while (gap > 0) {
                for (int i = gap; i < a.length; i++) {
                    T temp = a[i];
                    int j = i;
                    while (j >= gap && a[j - gap].compareTo(temp) > 0) {
                        a[j] = a[j - gap];
                        j -= gap;
                    }
                    a[j] = temp;
                }
                gap /= 2;
            }

    private static <T extends Comparable<T>> void swap(T[] data, int index1, int index2) {

        T temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;

    }
}





