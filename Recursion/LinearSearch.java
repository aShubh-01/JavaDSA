package Recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 6;
        System.out.println(findElementIndex(arr, 0, target));
    }

    static int findElementIndex(int[] arr, int index, int element) {
        if(index == arr.length) return -1;
        if(arr[index] == element) return index;
        return findElementIndex(arr, index + 1, element);
    }
}
