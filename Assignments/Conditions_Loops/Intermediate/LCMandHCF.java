package Assignments.Conditions_Loops.Intermediate;
import java.util.Scanner;
public class LCMandHCF {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter any two number : ");
        int num1 = read.nextInt(), num2 = read.nextInt();
        int highestCommonFactors = 0, leastCommonMultiplier = 0;

        for (int divisor = 2; divisor < Math.min(num1, num2); divisor++) {
            if ((num1 % divisor == 0) && (num2 % divisor == 0)) {
                leastCommonMultiplier = divisor;
            }
        }

        if (leastCommonMultiplier != 0) {
            highestCommonFactors = (num1 * num2) / leastCommonMultiplier;
            System.out.println("LCM : " + leastCommonMultiplier + "\nHCF : " + highestCommonFactors);
        } else {
            System.out.print("HCF and LCM are 0");
        }
    }
}