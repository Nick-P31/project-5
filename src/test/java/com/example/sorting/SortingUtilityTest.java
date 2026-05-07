package com.example.sorting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SortingUtilityTest {

    // ==================== GNOME SORT TESTS ====================

    @Test
    void gnomeSort_emptyArray() {
        Integer[] a = {};
        SortingUtility.gnomeSort(a);
        assertArrayEquals(new Integer[]{}, a);
    }

    @Test
    void gnomeSort_singleElement() {
        Integer[] a = {5};
        SortingUtility.gnomeSort(a);
        assertArrayEquals(new Integer[]{5}, a);
    }

    @Test
    void gnomeSort_alreadySorted() {
        Integer[] a = {1, 2, 3, 4, 5};
        SortingUtility.gnomeSort(a);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, a);
    }

    @Test
    void gnomeSort_reverseSorted() {
        Integer[] a = {5, 4, 3, 2, 1};
        SortingUtility.gnomeSort(a);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, a);
    }

    @Test
    void gnomeSort_duplicates() {
        Integer[] a = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};
        SortingUtility.gnomeSort(a);
        assertArrayEquals(new Integer[]{1, 1, 2, 3, 3, 4, 5, 5, 6, 9}, a);
    }

    @Test
    void gnomeSort_allSame() {
        Integer[] a = {5, 5, 5, 5, 5};
        SortingUtility.gnomeSort(a);
        assertArrayEquals(new Integer[]{5, 5, 5, 5, 5}, a);
    }

    @Test
    void gnomeSort_twoElementsSwapped() {
        Integer[] a = {2, 1};
        SortingUtility.gnomeSort(a);
        assertArrayEquals(new Integer[]{1, 2}, a);
    }

    @Test
    void gnomeSort_twoElementsSorted() {
        Integer[] a = {1, 2};
        SortingUtility.gnomeSort(a);
        assertArrayEquals(new Integer[]{1, 2}, a);
    }

    @Test
    void gnomeSort_randomOrder() {
        Integer[] a = {64, 34, 25, 12, 22, 11, 90};
        SortingUtility.gnomeSort(a);
        assertArrayEquals(new Integer[]{11, 12, 22, 25, 34, 64, 90}, a);
    }

    @Test
    void gnomeSort_strings() {
        String[] a = {"zebra", "apple", "mango", "banana"};
        SortingUtility.gnomeSort(a);
        assertArrayEquals(new String[]{"apple", "banana", "mango", "zebra"}, a);
    }

    // ==================== COCKTAIL SHAKER SORT TESTS ====================

    @Test
    void cocktailShakerSort_emptyArray() {
        Integer[] a = {};
        SortingUtility.cocktailShakerSort(a);
        assertArrayEquals(new Integer[]{}, a);
    }

    @Test
    void cocktailShakerSort_singleElement() {
        Integer[] a = {5};
        SortingUtility.cocktailShakerSort(a);
        assertArrayEquals(new Integer[]{5}, a);
    }

    @Test
    void cocktailShakerSort_alreadySorted() {
        Integer[] a = {1, 2, 3, 4, 5};
        SortingUtility.cocktailShakerSort(a);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, a);
    }

    @Test
    void cocktailShakerSort_reverseSorted() {
        Integer[] a = {5, 4, 3, 2, 1};
        SortingUtility.cocktailShakerSort(a);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, a);
    }

    @Test
    void cocktailShakerSort_duplicates() {
        Integer[] a = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};
        SortingUtility.cocktailShakerSort(a);
        assertArrayEquals(new Integer[]{1, 1, 2, 3, 3, 4, 5, 5, 6, 9}, a);
    }

    @Test
    void cocktailShakerSort_allSame() {
        Integer[] a = {5, 5, 5, 5, 5};
        SortingUtility.cocktailShakerSort(a);
        assertArrayEquals(new Integer[]{5, 5, 5, 5, 5}, a);
    }

    @Test
    void cocktailShakerSort_twoElementsSwapped() {
        Integer[] a = {2, 1};
        SortingUtility.cocktailShakerSort(a);
        assertArrayEquals(new Integer[]{1, 2}, a);
    }

    @Test
    void cocktailShakerSort_twoElementsSorted() {
        Integer[] a = {1, 2};
        SortingUtility.cocktailShakerSort(a);
        assertArrayEquals(new Integer[]{1, 2}, a);
    }

    @Test
    void cocktailShakerSort_randomOrder() {
        Integer[] a = {64, 34, 25, 12, 22, 11, 90};
        SortingUtility.cocktailShakerSort(a);
        assertArrayEquals(new Integer[]{11, 12, 22, 25, 34, 64, 90}, a);
    }

    @Test
    void cocktailShakerSort_strings() {
        String[] a = {"zebra", "apple", "mango", "banana"};
        SortingUtility.cocktailShakerSort(a);
        assertArrayEquals(new String[]{"apple", "banana", "mango", "zebra"}, a);
    }

    // ==================== SHELL SORT TESTS ====================

    @Test
    void shellSort_emptyArray() {
        Integer[] a = {};
        SortingUtility.shellSort(a);
        assertArrayEquals(new Integer[]{}, a);
    }

    @Test
    void shellSort_singleElement() {
        Integer[] a = {5};
        SortingUtility.shellSort(a);
        assertArrayEquals(new Integer[]{5}, a);
    }

    @Test
    void shellSort_alreadySorted() {
        Integer[] a = {1, 2, 3, 4, 5};
        SortingUtility.shellSort(a);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, a);
    }

    @Test
    void shellSort_reverseSorted() {
        Integer[] a = {5, 4, 3, 2, 1};
        SortingUtility.shellSort(a);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, a);
    }

    @Test
    void shellSort_duplicates() {
        Integer[] a = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};
        SortingUtility.shellSort(a);
        assertArrayEquals(new Integer[]{1, 1, 2, 3, 3, 4, 5, 5, 6, 9}, a);
    }

    @Test
    void shellSort_allSame() {
        Integer[] a = {5, 5, 5, 5, 5};
        SortingUtility.shellSort(a);
        assertArrayEquals(new Integer[]{5, 5, 5, 5, 5}, a);
    }

    @Test
    void shellSort_twoElementsSwapped() {
        Integer[] a = {2, 1};
        SortingUtility.shellSort(a);
        assertArrayEquals(new Integer[]{1, 2}, a);
    }

    @Test
    void shellSort_twoElementsSorted() {
        Integer[] a = {1, 2};
        SortingUtility.shellSort(a);
        assertArrayEquals(new Integer[]{1, 2}, a);
    }

    @Test
    void shellSort_randomOrder() {
        Integer[] a = {64, 34, 25, 12, 22, 11, 90};
        SortingUtility.shellSort(a);
        assertArrayEquals(new Integer[]{11, 12, 22, 25, 34, 64, 90}, a);
    }

    @Test
    void shellSort_strings() {
        String[] a = {"zebra", "apple", "mango", "banana"};
        SortingUtility.shellSort(a);
        assertArrayEquals(new String[]{"apple", "banana", "mango", "zebra"}, a);
    }
}
