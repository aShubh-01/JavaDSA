package Sorting.Cyclic_Sort;

public class MissingNumber {
    public static void main(String[] args){
        int[] nums = {0, 1};
        int missingNumberIndex = nums.length, index = 0;

        while(index != nums.length){
            if(nums[index] == nums.length){
               missingNumberIndex = index;
               index += 1;
            } else if(nums[index] != index){
                int temp = nums[nums[index]];
                nums[nums[index]] = nums[index];
                nums[index] = temp;
            } else {
                index += 1;
            }
        }

        System.out.println(missingNumberIndex);

    }
}
