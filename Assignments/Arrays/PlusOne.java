package Assignments.Arrays;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] numArray = {9};
        int number = 0;
        for(int index = 0; index < numArray.length; index++){
            number = (number * 10) + numArray[index];
        }
        number += 1;
        System.out.println(number);

        int reversedNum = 0;
        while(number != 0){
            reversedNum = (reversedNum * 10) + (number % 10);
            number /= 10;
        }

        int index = 0;
        while(reversedNum != 0){
            numArray[index] = reversedNum % 10;
            index++;
            reversedNum /= 10;
        }

        System.out.println(Arrays.toString(numArray));
    }
}
