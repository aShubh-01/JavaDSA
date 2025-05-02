package Recursion;

public class CheckSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 5};
        System.out.println(isSorted(arr, 0));
    }

    static boolean isSorted(int[] arr, int index) {
        System.out.println(arr[index]);
        if(index == arr.length - 1) return true;
        if(arr[index] > arr[index + 1]) return false;
        return  (arr[index] <= arr[index + 1]) & isSorted(arr, index + 1);
    }
}

/*
 * We can check neighbour elements whether they are sorted or not,
 * if not just return false, else return true && boolean evaluation of next comparison
*/