package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PassArrayInFunction {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("How many number you want to store in the array? : ");
        int size = read.nextInt();

        int[] nums = new int[size];
        System.out.println("Enter " + size + " number : ");
        for(int index = 0; index < size; index++){
            nums[index] = read.nextInt();
        }

        System.out.print("Which number should be changes? : ");
        int selectNum = read.nextInt();
        modifyNums(nums, selectNum);
    }

    static void modifyNums(int arr[], int number){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter new number : ");
        int changeNum = read.nextInt();
        for(int index = 0; index < arr.length; index++){
            if(arr[index] == number){
                arr[index] = changeNum;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
