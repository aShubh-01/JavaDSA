package Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] nums = {1, 4, 5, 7, 9};
        reverse(nums);
    }

    static void reverse(int[] nums){
        for(int index = 0; index <= nums.length/2; index++){
            int firstNum = nums[index];
            int lastNum = nums[nums.length - index - 1];
            nums[nums.length - index - 1] = firstNum;
            nums[index] = lastNum;
        }
        System.out.println(Arrays.toString(nums));
    }
}
