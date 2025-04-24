package Recursion;
import java.util.Arrays;
import java.lang.reflect.Array;

public class SumTrianleFromArray {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};
        printArr(nums);
    }

    static void printArr(int[] arr){
        if(arr.length < 1){
            return;
        }

        int[] newArr = new int[arr.length - 1];
        for(int index = 0; index < newArr.length; index++){
            newArr[index] = arr[index] + arr[index + 1];
        }

        printArr(newArr);
        System.out.println(Arrays.toString(arr));
    }
}
