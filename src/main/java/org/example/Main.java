package org.example;

import java.util.Arrays;

import static org.example.BubbleSort.bubbleSort;
import static org.example.BubbleSort.generateRandomArray;
import static org.example.InsertSelection.insertSelection;
import static org.example.SelectionSort.sortSelection;


public class Main {
    public static void main(String[] args) {

//        bubbleSort1();
//        selectionSort2();
//        insertSelection2();
      /*  sort();
        sort1();*/
        sort2();
    }
//
//    public static void bubbleSort1() {
//
//        int[] numbers = generateRandomArray();
//        bubbleSort(numbers);
//
//    }
//
//    public static void selectionSort2() {
//
//        int[] numbers = generateRandomArray();
//        sortSelection(numbers);
//
//    }
//
//    public static void insertSelection2() {
//        int[] numbers = generateRandomArray();
//        insertSelection(numbers);
//    }

   /* public static void sort() {
        int[] numbers = generateRandomArray();
        long start = System.currentTimeMillis();
        bubbleSort(numbers);
        System.out.println(System.currentTimeMillis() - start);
    }

    public static void sort1() {
        int[] numbers = generateRandomArray();
        long start = System.currentTimeMillis();
        sortSelection(numbers);
        System.out.println(System.currentTimeMillis() - start);
    }*/

    public static void sort2() {
        int[] numbers = generateRandomArray();
        long start = System.currentTimeMillis();
        insertSelection(numbers);
        System.out.println(System.currentTimeMillis() - start);
    }
}




