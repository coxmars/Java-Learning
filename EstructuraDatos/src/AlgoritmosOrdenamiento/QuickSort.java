package AlgoritmosOrdenamiento;

/*
QuickSort: It is based on the division of partitions of the list to be ordered, for this reason
it can be considered that it applies the divide and conquer technique. The method is possibly the
smallest in code, fastest, most elegant, and most interesting and efficient of the known sorting algorithms.
 */

public class QuickSort {
    private int i,j, pivot, auxiliar;

    // Quick Method
    public void quickSort (int [] array, int first, int last) {
        i = first;
        j = last;
        pivot = array[(first+last)/2];
        do {
            while (array[i]<pivot) {
                i++;
            }
            while (array[j]>pivot) {
                j--;
            }
            // Here we make the exchanges
            if (i<=j) {
                auxiliar = array[i];
                array[i] = array[j];
                array[j] = auxiliar;
                i++;
                j--;
            }
        } while (i<=j);
        if (first < j) {
            quickSort(array, first, j);
        }
        if (i<last) {
            quickSort(array, i, last);
        }
        showArray(array);
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
