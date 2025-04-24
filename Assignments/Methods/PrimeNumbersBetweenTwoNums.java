package Assignments.Methods;
import java.util.Scanner;
public class PrimeNumbersBetweenTwoNums {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter start and end of the range : ");
        int startNum = read.nextInt(), endNum = read.nextInt() + 1, number;
        while(startNum != endNum){
            number = startNum;
            if(checkPrime(number)){
                System.out.print(number + ", ");
            }
            startNum += 1;
        }

    }

    static boolean checkPrime(int number){
        for(int divisor = 2; divisor < number; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
