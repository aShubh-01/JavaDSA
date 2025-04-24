package Arrays;
import javax.sound.midi.SysexMessage;
import java.util.Scanner;
import java.util.ArrayList;
public class MaxNum {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter numbers(0 to stop reading) :");
        ArrayList<Integer> numList = new ArrayList<>();

        int number = read.nextInt();
        while (number != 0){
            numList.add(number);
            number = read.nextInt();
        }

        System.out.println("Maximum number is : " + max(numList));
    }
     static int max(ArrayList<Integer> nums){
        int max = nums.get(0);
        for(int number : nums){
            if(number > max){
                max = number;
            }
        }
        return max;
     }
}
