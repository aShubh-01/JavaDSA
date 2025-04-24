package Searching.Binary;

public class CeilingOfNumber {
    public static void main(String[] args){
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int target = 3;

        //Find the smallest element greater than equal to the target number
        int ans = ceilingNumber(arr, target);
        System.out.println(ans + " " + arr[ans]);
    }
    static int ceilingNumber(int[] arr,int target){
        if(target <= arr[0]) {
            return arr[0];
        }
        int start = 0, end = arr.length - 1;
        while(start <= end){
            int middle = start + (end - start) / 2;
            if(arr[middle] == target){
                return middle;
            } else if(arr[middle] > target){
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return start;
    }
}
