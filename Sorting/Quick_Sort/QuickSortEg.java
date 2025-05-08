package Sorting.Quick_Sort;

import java.util.Arrays;

public class QuickSortEg {
    public static void main(String[] args) {
        
        int arr[] = {4 , 3, 0, 2, 1};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    static void quickSort(int[] arr, int left, int right) {
        if(left >= right) return;

        int start = left;
        int end = right;
        int middle = start + (end - start) / 2;

        int pivot = arr[middle];

        while(start <= end) {
            while(pivot > arr[start]) start++;
            
            while(pivot < arr[end]) end--;

            if(start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        quickSort(arr, left, end);
        quickSort(arr, start, right);
    }
}

/*
    In quick sort, we pick an pivot element(it could be any random element from the array)
    Then swap all the elements less than pivot to left and all the elements greater than pivot to right
    Once we have does this swapping, the pivot will reach its correct position in the array
    after that we can perform the same operations on first and second halves to and from the pivot respectively.
*/