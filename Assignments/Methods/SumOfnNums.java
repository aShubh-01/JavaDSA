package Assignments.Methods;
import java.util.Scanner;

public class SumOfnNums {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter a range : ");
        int n = read.nextInt();
        System.out.println("Sum of first " + n + " numbers is " + sumOfFirstNums(n));
    }

    static int sumOfFirstNums(int number){

        //Optimized method
        return ((number * (number + 1)) / 2);

        //Standard Method
        /*
        int sum = 0;
        while(number != 0){
            sum += number;
            number -= 1;
        }
        return sum;
        */

    }
}
