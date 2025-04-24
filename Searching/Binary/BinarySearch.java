package Searching.Binary;
import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int[] arr = {20, 10, 5, 4, 3, 2, -1, -5};
        System.out.println(Arrays.toString(arr));

        System.out.print("element to search : ");
        int target = read.nextInt();

        boolean isAscending = arr[0] < arr[arr.length - 1];

        System.out.println("Element is at index " + binarySearch(arr, target, isAscending));
    }

    static int binarySearch(int[] arr,int target, boolean isAscending){
        int start = 0, end = arr.length - 1, middle = (start + end) / 2;
        
        while(target != arr[middle]){    //Ascending order binary search

            if(isAscending){
                if(target > arr[middle]){
                    start = middle + 1;
                } else {
                    end = middle - 1;
                }
            } else {
                if(target < arr[middle]){
                    start = middle + 1;
                } else {
                    end = middle - 1;
                }
            }

            if(start > end){
                return -1;
            }

            middle = (start + end) / 2;
        }
        return middle;
    }
}
