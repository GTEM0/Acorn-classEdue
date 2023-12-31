package java2prj1.interfaceEx.myarrys;

import java.util.Comparator;

public class MyArraysG  {

    public static<T> void sort(T[] arr, Comparator<T> c) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (c.compare(arr[i], arr[j]) > 0) {
                    T tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    public static<T extends Comparable<T>> void sort(T[] arr) {
    	for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareTo(  arr[j]) > 0) {
                    T tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }         
    }

	 
}
