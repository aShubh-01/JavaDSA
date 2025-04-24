package Sorting.Cyclic_Sort;

import java.util.ArrayList;

public class FIndAllDuplicates {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        ArrayList<Integer> duplicateNums = new ArrayList<>();
        
        int index = 0;
        while(index != nums.length){
            int correctIndex = nums[index] - 1;
            if(nums[index] != nums[correctIndex]){
                int temp = nums[index];
                nums[index] = nums[correctIndex];
                nums[correctIndex] = nums[index];
            } else {
                index += 1;
            }
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i + 1){
                duplicateNums.add(nums[i]);
            }
        }

        System.out.println(duplicateNums);
    }
}
