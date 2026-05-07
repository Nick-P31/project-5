
Prompt 1:
" Hey Claude, Write JUnit 5 unit tests for this method:
public static <T extends Comparable<T>> void gnomeSort(T[] a)
This method sorts an array in-place using the Gnome Sort algorithm.
It should handle:/**
* Sorts an array using Gnome Sort algorithm (Part A - 50 points)
* Works like a garden gnome sorting flower pots
* @param a the array of Comparable objects to sort (modified in place)
  */
"

Prompt 2:
* "public static <T extends Comparable<T>> void cocktailShakerSort(T[] a) {}
* /**
* Sorts an array using Cocktail Shaker Sort algorithm (Part B - 50 points)
* A bidirectional bubble sort that alternates direction each pass
* @param a the array of Comparable objects to sort (modified in place)
  */"
  
Prompt 3:
* "public static <T extends Comparable<T>> void shellSort(T[] a) {}
* /**
* Sorts an array using Shell Sort algorithm (NOT REQUIRED - removed from grading)
* Uses Ciura gap sequence for improved performance
* @param a the array of Comparable objects to sort (modified in place)
  */"

Testing Prompt:

 "Hey claude can you create a testing class called SortingUtilityTest that contains
 JUnit 5 unit tests for the gnomeSort, cocktailShakerSort, and shellSort methods?
 The tests should cover different cases, like sorting an empty array, an array with one element, an already sorted array,
 a reverse sorted array, and an array with duplicate elements. Each test should assert that the output array is correctly
 sorted after calling the respective sorting method."