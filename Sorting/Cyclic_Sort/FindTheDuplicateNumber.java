package Sorting.Cyclic_Sort;

public class FindTheDuplicateNumber {
    public static void main(String[] args){
        int[] nums = {2, 2, 2, 2, 2};
        int index = 0;
        while (index != nums.length) {
            int correctIndex = nums[index] - 1;
            if(nums[index] != nums[correctIndex]){
                int temp = nums[index];
                nums[index] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                index += 1;
            }
        }

        System.out.println(nums[nums.length - 1]);
    }
}
