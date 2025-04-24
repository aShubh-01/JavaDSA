package Arrays;

import java.util.Scanner;

public class MutlidimensionalArrays{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[][] arr = new int[3][2];
        for(int row = 0; row < arr.length; row++){
            System.out.println("Row " + row);
            for(int column = 0; column < arr[row].length; column++){
                arr[row][column] = read.nextInt();
            }
        }

        for(int row = 0; row < arr.length; row++){
            for(int column = 0; column < arr[row].length; column++){
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
    }
}
