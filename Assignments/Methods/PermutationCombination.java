package Assignments.Methods;
import java.util.Scanner;
public class PermutationCombination {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter number of distinct objects : ");
        float distinctObjects = read.nextInt();
        System.out.print("Enter number of objects taken at a time : ");
        float rObjects = read.nextInt();

        float permutation = factorialOf(distinctObjects) / factorialOf(distinctObjects - rObjects);
        float combination = permutation / factorialOf(rObjects);

        System.out.println("Permutation is : " + permutation + "\nCombination is : " + combination);
    }
    static float factorialOf(float number){
        float factorial = 1;
        for(int multiplier = 1; multiplier <= number; multiplier++){
            factorial *= multiplier;
        }
        return factorial;
    }
}
