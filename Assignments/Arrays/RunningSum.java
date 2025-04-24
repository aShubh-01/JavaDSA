package Assignments.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1};
        int[] runningSum = new int[nums.length];
        for(int index = 0; index < runningSum.length; index++){
            int sum = 0;
            for(int j = 0; j <= index; j++){
                sum += nums[j];
            }
            runningSum[index] = sum;
        }

        System.out.println(Arrays.toString(runningSum));
    }
}
