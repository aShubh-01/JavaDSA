package Searching.Linear;
import java.util.Scanner;

public class SearchIn2DArrayRange {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int[][] arr = { {1, 3, 56},
                        {45, 12, 67},
                        {55, -4, 7},
                        {12, 36, 154},
                        {45, 89, 35}  };

        int target = 154;
        System.out.print("Enter start : ");
        int start = read.nextInt();
        System.out.print("Enter end : ");
        int end = read.nextInt();

        for(int row = start; row < end; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] == target){
                    System.out.println(row + ", " + col);
                }
            }
        }
    }
}
