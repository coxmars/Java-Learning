package AlgoritmosOrdenamiento;

/*
Insertion Sort: Insertion sort is a sorting algorithm in which the elements are transferred one at a time
to the right position. In other words, an insertion sort helps in building the final sorted list, one item
at a time, with the movement of higher-ranked elements. An insertion sort has the benefits of simplicity
and low overhead.
 */

public class InsertionSort {
    private int i,j,auxiliar;

    // Insertion Method
    public void insertionSort (int [] array, int n) {
        for (i=1;i<n;i++) {
            auxiliar= array[i];
            j = i-1;
            while (j >= 0 && array[j]>auxiliar) {
                array[j+1]=array[j];
                j=j-1;
            }
            array[j+1]=auxiliar;
        }
        System.out.println("Insertion Sorted Array");
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
