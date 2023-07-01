package AlgoritmosBusqueda;

/*
Binary Search: Binary Search is a searching algorithm used in a sorted array by repeatedly dividing
the search interval in half. The idea of binary search is to use the information that the array is
sorted and reduce the time complexity to O(Log n).
 */

public class BinarySearch {


    // Binary Search Method
    public int binarySearch (int [] array, int element) {
        int center, first, last, centerValue;
        first = 0;
        last = array.length-1;
        while (first <= last) {
            center = (first+last)/2;
            centerValue = array[center];
            System.out.println("Comparing to " + element + " with " + array[center]);
            if (element == centerValue) {
                return center;
            }
            else if (element < centerValue){
                last = center-1;
            }
            else {
                first = center+1;
            }
        }
        return -1;
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
