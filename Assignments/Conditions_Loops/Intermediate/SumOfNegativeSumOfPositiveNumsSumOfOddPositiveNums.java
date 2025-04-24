package Assignments.Conditions_Loops.Intermediate;
import java.util.Scanner;

public class SumOfNegativeSumOfPositiveNumsSumOfOddPositiveNums {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter number(0 to stop reading) : ");
        int number = 0, sumOfPositiveNums = 0, sumOfNegativeNums = 0, sumOfOddPositiveNums = 0;
        do{
            if(number >= 0) {
                sumOfPositiveNums += number;
                if (number % 2 != 0) {
                    sumOfOddPositiveNums += number;
                }
            } else {
                sumOfNegativeNums += number;
            }
            number = read.nextInt();
        }while(number != 0);

        System.out.println("Sum of Positive Number : " + sumOfPositiveNums);
        System.out.println("Sum of Odd Positive Number : " + sumOfOddPositiveNums);
        System.out.println("Sum of Negative Number : " + sumOfNegativeNums);
    }
}
