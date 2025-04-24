package Assignments.Arrays;

public class MaximumSubarray {
    public static void main(String[] args){
        int[] nums = {-2, -1};
        int n = nums.length;
        int maxSum = 0;
        for(int num = 0; num < n; num++){
            for(int i = 0; i < n; i++){
                int sum = 0;
                for(int j = n - 1; j >= i; j--){
                    System.out.print(nums[j] + " ");
                    sum += nums[j];
                }
                System.out.println();
                System.out.println(sum);
                if(maxSum < sum) {
                    maxSum = sum;
                }
            }
            n--;
        }

        System.out.println(maxSum);
    }
}
