package Arrays.Easy;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 3;
        rotateArray(arr, n);
        System.out.println(Arrays.toString(arr));
    }

    static void rotateArray(int []arr, int n){
        reverseElement(arr, 0, arr.length - n - 1);
        reverseElement(arr, arr.length - n, arr.length - 1);
        reverseElement(arr, 0, arr.length - 1);
    }

    static void reverseElement(int[] arr, int start, int end){
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start += 1;
            end -= 1;
        }
    }
}
