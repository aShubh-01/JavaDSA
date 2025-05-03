package Recursion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 3, 0};
        System.out.println(Arrays.toString(bubbleSort(arr, arr.length - 1, 0)));
    }

    static int[] bubbleSort(int[] arr, int range, int index) {

        if(range > 0) {
            if(index == range) bubbleSort(arr, range - 1, 0);
            else {
                if(arr[index] > arr[index + 1]) {
                    int temp = arr[index + 1];
                    arr[index + 1] = arr[index];
                    arr[index] = temp;
                }
                bubbleSort(arr, range, index + 1);
            }
        }

        return arr;
    }
}