package Sorting.Cyclic_Sort;
import java.util.Arrays;
public class CyclicSortEg {
    public static void main(String[] args){
        int[] arr = {10, 1, 7, 4, 6, 5, 2, 8, 3, 9};

        int index = 0;

        while(index != arr.length){
            int correctIndex = arr[index] - 1;
            if(arr[index] != arr[correctIndex]){
                int temp = arr[index];
                arr[index] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                index += 1;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
