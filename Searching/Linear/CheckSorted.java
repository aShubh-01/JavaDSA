package Searching.Linear;

public class CheckSorted {
    public static void main(String[] args){
        int[] arr = {1, 2, 2, 3, 5};

        for(int index = 1; index < arr.length; index++){
            if(arr[index - 1] <= arr[index]) {
                continue;
            } else {
                System.out.println("The Array is not sorted");
                return;
            }
        }

        System.out.println("The Array is Sorted");
    }
}
