package Recursion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {-3, -6, 2, 1, 0};
        System.out.println(Arrays.toString(seletionSort(arr, arr.length - 1, 0, 0)));
    }

    static int[] seletionSort(int[] arr, int range, int maxIndex, int index) {
        // for(int range = arr.length - 1; range > 0; range--) {
        //     int largestNumIndex = 0;
        //     for(int index = 0; index <= range; index++) {
        //         if(arr[largestNumIndex] < arr[index]) largestNumIndex = index;
        //     }

        //     int temp = arr[largestNumIndex];
        //     arr[largestNumIndex] = arr[range];
        //     arr[range] = temp;
        // }

        if(range > 0) {
            if(index <= range) {
                if(arr[maxIndex] < arr[index]) maxIndex = index;
                seletionSort(arr, range, maxIndex, index + 1);
            } else {
                int temp = arr[maxIndex];
                arr[maxIndex] = arr[range];
                arr[range] = temp;
                seletionSort(arr, range - 1, 0, 0);
            }
        }

        return arr;
    }
}

/*
 * If we want to sort the array in ascending order using sel sort.
 * Then we need to iterate over the array, find the largest element and swap it with last element in the array.
 * then reduce the range of search by 1, perform the same search and swap in that range.
*/