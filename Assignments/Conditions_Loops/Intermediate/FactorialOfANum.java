package Assignments.Conditions_Loops.Intermediate;
import java.util.Scanner;
public class FactorialOfANum {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = read.nextInt(), factorial = 1;
        while(number != 0){
            factorial *= number;
            number -= 1;
        }
        System.out.println(factorial);
    }
}
