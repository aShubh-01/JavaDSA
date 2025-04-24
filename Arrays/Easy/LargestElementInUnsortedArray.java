package Arrays.Easy;

public class LargestElementInUnsortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 7};
        System.out.println(checkLargestElement(arr, 0, arr[0]));
    }

    static int checkLargestElement(int[] arr, int index, int largestNum){
        if(index > arr.length - 1) return largestNum;

        if(arr[index] > largestNum) return checkLargestElement(arr, index + 1, arr[index]);

        return checkLargestElement(arr, index + 1, largestNum);
    }
}