package Sorting.Insertion_Sort;

import java.util.Arrays;
public class InsertionSortEg {
    public static void main(String[] args){
        int[] nums = {5, 3, 4, 1, 2};

        System.out.println(Arrays.toString(insertionSort(nums)));
    }
    static int[] insertionSort(int[] arr){

        for(int range = 0; range < arr.length - 1; range++){
            for(int index = range + 1; index > 0; index--){
                if(arr[index] < arr[index - 1]){
                    int temp = arr[index];
                    arr[index] = arr[index - 1];
                    arr[index - 1] = temp;
                } else {
                    break;
                }
            }
        }

        return arr;
    }
}

