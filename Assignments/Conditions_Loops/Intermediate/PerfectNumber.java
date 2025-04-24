package Assignments.Conditions_Loops.Intermediate;
import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = read.nextInt();
        int sumOfFactors = 0;
        for(int num = 1; num < number; num++){
            if(number % num == 0){
                sumOfFactors += num;
                System.out.print(num + " ");
            }
        }
        if(sumOfFactors == number){
            System.out.println("\nIt is a perfect number");
        } else {
            System.out.println("\nIt is not a perfect number");
        }
    }
}
