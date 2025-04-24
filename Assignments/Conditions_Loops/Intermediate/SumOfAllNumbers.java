package Assignments.Conditions_Loops.Intermediate;
import java.util.Scanner;
public class SumOfAllNumbers {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter number(0 to stop reading) : ");
        long sum = 0L;
        int largest = 0, num = 0;
        do{
            sum += num;
            if(largest < num){
                largest = num;
            }
            num = read.nextInt();
        }while(num != 0);

        System.out.println("Sum of the digits : " + sum + "\nLargest digit : " + largest);
    }
}
