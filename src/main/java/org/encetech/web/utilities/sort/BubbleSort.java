package org.encetech.web.utilities.sort;

/*
 * Web Utilities
 * BubbleSort.java
 * Author: Christian J. Gonzalez
 */
import java.util.List;

/**
 * The BubbleSort class provides methods for sorting arrays and lists using the bubble sort algorithm.
 * Swap elements that are not in their right location until sorted
 * Time Complexity: O(n)
 */
public class BubbleSort {
  private Boolean isSorted = false;
  private final String SUCCESS_MESSAGE = "BubbleSort was successful";

  private String completed() {
    return SUCCESS_MESSAGE;
  }

  /**
   * @description Sorts an array of type T in ascending order
   * @param array T array to be sorted
   * @return String SUCCESS_MESSAGE
   * @param <T> Generic type
   */
  public <T extends Comparable<T>> String sortAscending(T[] array) {
    while (!isSorted) {
      isSorted = true;
      for (int i = 0; i < array.length - 1; i++) {
        if (array[i].compareTo(array[i + 1]) > 0) {
          T temp = array[i];
          array[i] = array[i + 1];
          array[i + 1] = temp;
          isSorted = false;
        }
      }
    }
    return completed();
  }

  /**
   * @description Sorts an array in descending order.
   *
   * @param array the array to be sorted
   * @param <T>   the generic type of the array elements, must be comparable
   * @return a string indicating that the sorting operation is completed
   */
  public <T extends Comparable<T>> String sortDescending(T[] array) {
    while (!isSorted) {
      isSorted = true;
      for (int i = 0; i < array.length - 1; i++) {
        if (array[i].compareTo(array[i + 1]) < 0) {
          T temp = array[i];
          array[i] = array[i + 1];
          array[i + 1] = temp;
          isSorted = false;
        }
      }
    }
    return completed();
  }

  public <T extends Comparable<T>> String sortAscending(List<T> list) {
    while (!isSorted) {
      isSorted = true;
      for (int i = 0; i < list.size() - 1; i++) {
        if (list.get(i).compareTo(list.get(i + 1)) > 0) {
          T temp = list.get(i);
          list.set(i, list.get(i + 1));
          list.set(i + 1, temp);
          isSorted = false;
        }
      }
    }
    return completed();
  }

  public <T extends Comparable<T>> String sortDescending(List<T> list) {
    while (!isSorted) {
      isSorted = true;
      for (int i = 0; i < list.size() - 1; i++) {
        if (list.get(i).compareTo(list.get(i + 1)) < 0) {
          T temp = list.get(i);
          list.set(i, list.get(i + 1));
          list.set(i + 1, temp);
          isSorted = false;
        }
      }
    }
    return completed();
  }

  public <T extends Comparable<T>> String sortAscending(
    T[] array,
    int start,
    int end
  ) {
    while (!isSorted) {
      isSorted = true;
      for (int i = start; i < end; i++) {
        if (array[i].compareTo(array[i + 1]) > 0) {
          T temp = array[i];
          array[i] = array[i + 1];
          array[i + 1] = temp;
          isSorted = false;
        }
      }
    }
    return completed();
  }

  public <T extends Comparable<T>> String sortDescending(
    T[] array,
    int start,
    int end
  ) {
    while (!isSorted) {
      isSorted = true;
      for (int i = start; i < end; i++) {
        if (array[i].compareTo(array[i + 1]) < 0) {
          T temp = array[i];
          array[i] = array[i + 1];
          array[i + 1] = temp;
          isSorted = false;
        }
      }
    }
    return completed();
  }

  /*
    Sort Objects by a field
     */
  public String sortAscending(Object[] array, String fieldName) {
    while (!isSorted) {
      isSorted = true;
      for (int i = 0; i < array.length - 1; i++) {
        try {
          if (
            array[i].getClass()
              .getField(fieldName)
              .get(array[i])
              .toString()
              .compareTo(
                array[i + 1].getClass()
                  .getField(fieldName)
                  .get(array[i + 1])
                  .toString()
              ) >
            0
          ) {
            Object temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
            isSorted = false;
          }
        } catch (NoSuchFieldException | IllegalAccessException e) {
          e.printStackTrace();
        }
      }
    }
    return completed();
  }

  public String sortDescending(Object[] array, String fieldName) {
    while (!isSorted) {
      isSorted = true;
      for (int i = 0; i < array.length - 1; i++) {
        try {
          if (
            array[i].getClass()
              .getField(fieldName)
              .get(array[i])
              .toString()
              .compareTo(
                array[i + 1].getClass()
                  .getField(fieldName)
                  .get(array[i + 1])
                  .toString()
              ) <
            0
          ) {
            Object temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
            isSorted = false;
          }
        } catch (NoSuchFieldException | IllegalAccessException e) {
          e.printStackTrace();
        }
      }
    }
    return completed();
  }
}
