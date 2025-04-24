package Assignments.Conditions_Loops.Intermediate;
import java.util.Scanner;
public class SubtractProductAndSumOfAnNumber {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = read.nextInt();
        int product = 1, sum = 0;
        while(number > 0){
            product *= number % 10;
            sum += number % 10;
            number /= 10;
        }
        System.out.println(product - sum);
    }
}