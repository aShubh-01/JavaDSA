package Sorting.Selection_Sort;

import java.util.Arrays;
public class descendingSelectionSort {
    public static void main(String[] args){
        int[] arr = {-3, -6, 1, -15, 0};

        int range = 0;
        while(range < arr.length){
            int minIndex = arr.length - 1;
            for(int index = range; index < arr.length; index++){
                if(arr[minIndex] >= arr[index]){
                    minIndex = index;;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[range];
            arr[range] = temp;

            range += 1;
        }

        System.out.println(Arrays.toString(arr));
    }
}
