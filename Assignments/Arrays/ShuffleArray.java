package Assignments.Arrays;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class ShuffleArray {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int[] nums = new int[2 * n];
        for(int index = 0; index < nums.length; index++){
            nums[index] = index + 1;
            System.out.print(nums[index] + " ");
        }
        System.out.println();

        ArrayList<Integer> numList = new ArrayList<>();
        for(int index = 0; index < n; index++){
            numList.add(nums[index]);
            numList.add(nums[n + index]);
        }

        for(int index = 0; index < 2* n; index++){
            System.out.print(numList.get(index) + " ");
        }
    }
}
