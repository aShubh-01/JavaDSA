package Assignments.Conditions_Loops.Intermediate;
import java.util.Scanner;
public class PowerOfANum {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter base and power : ");
        int base = read.nextInt(), power = read.nextInt();
        int baseToThePower = 1;
        while (power != 0){
            baseToThePower *= base;
            power -= 1;
        }
        System.out.print(baseToThePower);
    }
}
