package AlgoritmosOrdenamiento;

/*
Bubble Sort: Bubble sort is a simple sorting algorithm. This sorting algorithm is comparison-based
algorithm in which each pair of adjacent elements is compared and the elements are swapped
if they are not in order. This algorithm is not suitable for large data sets as its average
and worst case complexity are of Ο(n2) where n is the number of items.
 */

public class BubbleSort {
    private int i,j,temporal,exchanges;

    public BubbleSort () {
        this.i = 0;
        this.j = 0;
        this.temporal = 0;
    }

    // Bubble Method Version 1
    public void bubbleSort(int [] array) {
        exchanges = 0;
        for (i=0; i < array.length; i++) {
            for (j=i+1; j < array.length; j++) {
                // Here we start the comparisons and swaps
                if (array[i]>array[j]) {
                    temporal = array[i];
                    array[i] = array[j];
                    array[j] = temporal;
                }
                exchanges++;
            }
        }
        System.out.println("Bubble Sorted Array");
        showArray(array);
        System.out.println("Finished with " + exchanges + " exchanges");
    }
    // Bubble Method Version 2
    public void bubbleSort2(int [] array) {
        exchanges = 0;
        for (i=1; i < array.length; i++) {
            for (j=0; j < array.length-1; j++) {
                // Here we start the comparisons and swaps
                if (array[j]>array[j+1]) {
                    temporal = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temporal;
                }
                exchanges++;
            }
        }
        System.out.println("Bubble Sorted Array");
        showArray(array);
        System.out.println("Finished with " + exchanges + " exchanges");
    }
    // Show array data
    public void showArray(int [] array) {
        int k;
        for (k=0; k < array.length; k++) {
            System.out.print("[" + array[k] + "]");
        }
        System.out.println();
    }


}
