package AlgoritmosBusqueda;

import AlgoritmosOrdenamiento.ShellSort;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SequentialSearch sequentialSearch = new SequentialSearch();
        BinarySearch binarySearch = new BinarySearch();
        ShellSort shellSort = new ShellSort();

        // Here we use the sequential/lineal search
        /*
        int [] arraySequentialSearch = {5,2,1,8,3,9,7};
        System.out.println("The original array is: ");
        sequentialSearch.showArray(arraySequentialSearch);
        int search = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a number to be searched: ","Search Number",JOptionPane.INFORMATION_MESSAGE));
        int index = sequentialSearch.sequentialSearch(arraySequentialSearch,search);
        if (index!=-1) {
            JOptionPane.showMessageDialog(null,"Element " + search + " found at index " + index);
        }
        else {
            JOptionPane.showMessageDialog(null,"Element " + search + " not found");
        }
        */


        // Here we use the binary search
        int [] arrayBinarySearch = {50,22,11,80,35,97,71};
        System.out.println("The original array is: ");
        binarySearch.showArray(arrayBinarySearch);
        shellSort.shellSort(arrayBinarySearch); // Here we order the array with the Shell Sort
        int search = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a number to be searched: ","Search Number",JOptionPane.INFORMATION_MESSAGE));
        int index = binarySearch.binarySearch(arrayBinarySearch,search);
        if (index!=-1) {
            JOptionPane.showMessageDialog(null,"Element " + search + " found at index " + index);
        }
        else {
            JOptionPane.showMessageDialog(null,"Element " + search + " not found");
        }



    }
}
