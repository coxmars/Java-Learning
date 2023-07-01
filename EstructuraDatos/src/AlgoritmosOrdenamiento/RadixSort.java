package AlgoritmosOrdenamiento;

/*
Radix Sort: is a no comparative sorting algorithm. This algorithm avoids comparisons by inserting elements
into buckets according to the radix (Radix/Base is the number of unique digits used to represent numbers.
For example, decimal numbers have ten unique digits). Sorts the elements based on the digits of the individual
elements. Performs the order by counting the digits from the least significant to the most significant.
 */

public class RadixSort {
    private int x,i,j;

    // Radix Method
    public void radixSort(int [] array) {
        for (x=Integer.SIZE-1; x>=0; x--) {
            int [] auxiliar = new int [array.length];
            j = 0;
            for (i = 0; i < array.length; i++) {
                boolean move = array[i] << x >= 0;
                if (x == 0 ? !move:move) {
                   auxiliar[j] = array[i];
                    j++;
                }
                else {
                    array[i-j]= array[i];
                }
            }
            for (i=j; i<auxiliar.length; i++) {
                auxiliar[i] = array[i-j];
            }
            array = auxiliar;
        }
        System.out.println("Radix Sorted Array");
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
