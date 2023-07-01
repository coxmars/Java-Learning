package AlgoritmosOrdenamiento;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        RadixSort radixSort = new RadixSort();
        QuickSort quickSort = new QuickSort();
        InsertionSort insertionSort = new InsertionSort();
        ShellSort shellSort = new ShellSort();
        // Here we create the array for the bubble sort
        int [] arrayBubble = {10,23,40,2,4,8,400};
        int [] arrayRadix = {45,32,1,62,300,240,640};
        int [] arrayQuick = {5,2,1,8,3,9,7};
        int [] arrayShell = {1,10,100,85,33,92,4};
        // This is the Bubble Sort
        System.out.println("Original Array");
        bubbleSort.showArray(arrayBubble);
        bubbleSort.bubbleSort(arrayBubble);
        // This is the Radix Sort
        System.out.println("Original Array");
        radixSort.showArray(arrayRadix);
        radixSort.radixSort(arrayRadix);
        // This is the Quick Sort
        System.out.println("Original Array");
        quickSort.showArray(arrayQuick); // Here we pass the array, 0 is first index and array.length to get the last index
        System.out.println("Quick Sorted Array");
        quickSort.quickSort(arrayQuick,0,arrayQuick.length-1);
        // This is the Insertion Sort, here we ask for the data
        int tam;
        tam = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the array size"));
        int [] arrayInsertion = new int [tam];
        for (int i=0; i<tam; i++) {
            arrayInsertion[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the number in index "+i));
            insertionSort.insertionSort(arrayInsertion,i+1);
        }
        // This is the Shell Sort
        System.out.println("Original Array");
        shellSort.showArray(arrayShell);
        shellSort.shellSort(arrayShell);
    }
}
