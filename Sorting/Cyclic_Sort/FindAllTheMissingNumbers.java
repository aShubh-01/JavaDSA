package Sorting.Cyclic_Sort;

import java.util.ArrayList;

public class FindAllTheMissingNumbers {
    public static void main(String[] args){
        int[] nums = {1, 1};
        ArrayList<Integer> missingNums = new ArrayList<>();

        int index = 0;
        while(index != nums.length){
            int correctIndex = nums[index] - 1;
            if(nums[index] != nums[correctIndex]){
                int temp = nums[index];
                nums[index] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                index += 1;
            }
        }

        for(int i = 0; i < nums.length; i++){
            if(i != nums[i] - 1){
                missingNums.add(i + 1);
            }
        }

        System.out.println(missingNums);

    }
}
