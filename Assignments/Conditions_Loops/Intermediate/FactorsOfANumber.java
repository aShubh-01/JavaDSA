package Assignments.Conditions_Loops.Intermediate;
import java.util.Scanner;
public class FactorsOfANumber {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        while(true){
            System.out.print("Enter a number : ");
            int number = read.nextInt();
            for(int factor = 2; factor < number; factor++) {
                if(number % factor == 0){
                    System.out.print(factor + " ");
                }
            }
        }
    }
}