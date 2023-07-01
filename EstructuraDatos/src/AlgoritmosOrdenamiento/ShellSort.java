package AlgoritmosOrdenamiento;

/*
Shell Sort: ShellSort is mainly a variation of Insertion Sort. In insertion sort, we move elements only one
position ahead. When an element has to be moved far ahead, many movements are involved.
The idea of shellSort is to allow exchange of far items.
 */

public class ShellSort {
    private int jump,i,j,k,auxiliar;

    // Shell Method
    public void shellSort (int [] array) {
        jump = array.length/2;
        while (jump > 0) {
            for (i=jump; i<array.length; i++) {
                j = i-jump;
                while (j >= 0) {
                    k = j+jump;
                    if (array[j] <= array[k]) {
                        j = -1;
                    }
                    else {
                        auxiliar = array[j];
                        array[j] = array[k];
                        array[k] = auxiliar;
                        j-= jump; // j = j-jump;
                    }
                }
            }
            jump = jump/2;
        }
        System.out.println("Shell Sorted Array");
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
