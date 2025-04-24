package Assignments.Arrays;
import java.util.Arrays;
public class SmallerNumbersThanCurrent {
    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4, 5};
        int[] result = new int[nums.length];

        for(int index = 0; index < nums.length; index++){
            int smallNumCount = 0;
            for(int i = 0; i < index; i++){
                if(nums[index] > nums[i] && i != index){
                    smallNumCount += 1;
                }
            }

            result[index] = smallNumCount;
        }

        System.out.println(Arrays.toString(result));
    }
}
