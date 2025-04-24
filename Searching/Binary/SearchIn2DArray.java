package Searching.Binary;
import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args){
        int[][] mat = { {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9} };

        int target = 5;

        //Check the row that contains target element
        int[] ans = checkRow(mat, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] checkRow(int[][] arr, int target){
        int start = 0, end = arr.length - 1;
        while(start <= end){
            int middle = start + (end - start) / 2;
            if(arr[middle][0] <= target){
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return bsTarget(end, arr[end], target);
    }

    static int[] bsTarget(int row, int[] arr, int target){ //Check the target element from the row
        int[] ans = new int[2];
        int start = 0, end = arr.length - 1;
        while(start <= end){
            int middle = start + (end - start) / 2;
            if(arr[middle] <= target){
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        ans[0] = row;
        ans[1] = end;
        return ans;
    }
}
