package AlgoritmosBusqueda;

/*
Sequential/Lineal Search: The sequential search (sometimes called a linear search) is the simplest type
of search, it is used when a list of integers is not in any order. It examines the first element in the
list and then examines each "sequential" element in the list until a match is found.
 */

public class SequentialSearch {

    // Sequential Search Method
    public int sequentialSearch (int [] array, int element) {
        boolean found = false;
        int i;
        for (i =0; i <array.length && found == false; i++) {
            if (element == array[i]) {
                found = true;
                return i;
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
