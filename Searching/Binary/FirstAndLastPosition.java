package Searching.Binary;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args){
        int[] nums = {1, 3, 4, 4, 4, 5, 5, 6, 7, 10};
        int target = 5;

        System.out.println(Arrays.toString(firstAndLast(nums, target)));

    }
    static int[] firstAndLast(int[] arr, int target){
        int[] ans = {-1, -1};
        int start = 0, end = arr.length - 1;
        while(start <= end){
            int middle = start + (end - start) / 2;

            if(target <= arr[middle]){
                if(target == arr[middle]) {
                    ans[0] = middle;
                }
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        start = 0;
        end = arr.length - 1;

        while(start <= end){
            int middle = start + (end - start) / 2;

            if(target >= arr[middle]){
                if(target == arr[middle]) {
                    ans[1] = middle;
                }
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return ans;
    }
}
