package Searching.Linear;

public class NumsWithEvenDigits {
    public static void main(String[] args){
        int[] nums = { 23, 456, 677, 1, 5198, 65789, 123 };
        int evenDigit = 0;
        for(int index = 0; index < nums.length; index++){
            int digitCount = 0;
            while(nums[index] != 0){
                digitCount += 1;
                nums[index] /= 10;
            }
            if(digitCount % 2 == 0){
                evenDigit += 1;
            }
        }

        System.out.println(evenDigit);

    }
}
