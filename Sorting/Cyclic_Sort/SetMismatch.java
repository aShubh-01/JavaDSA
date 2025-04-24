package Sorting.Cyclic_Sort;
import java.util.Arrays;
public class SetMismatch {
    public static void main(String[] args){
        int nums[] = {1, 3, 3, 2, 4};
        int[] ans = new int[2];

        int index = 0;
        while(index != nums.length){
            int correctIndex = nums[index] - 1;
            if(nums[index] == nums.length){
                ans[0] = index;
                index += 1;
            } else if(nums[index] != nums[correctIndex]){
                int temp = nums[index];
                nums[index] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                index += 1;
            }
        }

        for(int i = 0; i < nums.length; i++){
            if(i != nums[i] - 1){
                ans[1] = nums[i];
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
