package Assignments.Methods;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = read.nextInt();
        System.out.println(factorialOf(number));
    }
    static int factorialOf(int number){
        int factorial = 1;
        for(int multiplier = 1; multiplier <= number; multiplier++){
            factorial *= multiplier;
        }
        return factorial;
    }
}
