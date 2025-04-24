package Assignments.Arrays;

public class FrequencyCount {
    public static void main(String[] args){
        int[] nums = {1, 2, 2, 2, 2, 2, 3, 4, 4, 1, 1};
        int maxFrequency = 0, number = 0;
        for(int index = 0; index < nums.length; index++){
            int currentFrequency = 0;
            for(int i = 0; i < nums.length; i++){
                if(nums[i] == nums[index]){
                    currentFrequency++;
                }
            }
            if(maxFrequency < currentFrequency){
                maxFrequency = currentFrequency;
                number = nums[index];
            }
        }

        System.out.println(number);
    }
}
