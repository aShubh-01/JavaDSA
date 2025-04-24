package Searching.Binary;

public class SingleElementInSortedArray {
    public static void main(String[] args){
        int[] nums = {1, 1, 2, 2, 3, 3, 4, 4, 5};
        int start = 0, end = nums.length - 1;

        while(start < end){
            int middle = start + (end - start) / 2;
            if(middle % 2 == 0){
                middle--;
            }
            if(nums[middle] == nums[middle - 1]){
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        System.out.println(start + " " + nums[start]);
    }
}
