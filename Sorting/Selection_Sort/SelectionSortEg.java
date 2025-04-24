package Sorting.Selection_Sort;

import java.util.Arrays;
public class SelectionSortEg {
    public static void main(String[] args){
        int[] arr = {3, 2, 0, -3 , -2};
        System.out.println(Arrays.toString(selectionSort(arr)));

    }
    static int[] selectionSort(int[] arr){
        int range = arr.length - 1;
        while(range > 0){
            int maxIndex = 0;
            for(int index = 0; index <= range; index++){
                if(arr[maxIndex] < arr[index]){
                    maxIndex = index;
                }
            }
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[range];
            arr[range] = temp;

            range -= 1;
        }

        return arr;
    }
}
