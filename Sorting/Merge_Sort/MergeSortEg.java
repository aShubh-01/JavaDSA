package Sorting.Merge_Sort;

import java.util.Arrays;

public class MergeSortEg {
    public static void main(String[] args) {
        int[] arr = {4, 3, 0, 1, 2};

        System.out.println("Sorted - " + Arrays.toString(
            mergeSort(arr)
        ));
    }

    static int[] mergeSort(int[] arr) {
        if(arr.length <= 1) return arr;

        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        left = mergeSort(left);
        right = mergeSort(right);

        return mergeArrays(left, right);
    }

    static int[] mergeArrays(int[] left, int[] right) {
        int[] mergedArray = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while(i < left.length && j < right.length) {
            if(left[i] < right[j]) {
                mergedArray[k++] = left[i++];
            } else {
                mergedArray[k++] = right[j++];
            }
        }

        while(i < left.length) mergedArray[k++] = left[i++];

        while(j < right.length) mergedArray[k++] = right[j++];

        return mergedArray;
    }
}

/*
    {4, 3, 0, 1, 2}
     0  1  2  3  4
    
*/