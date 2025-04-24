package Arrays.Easy;

public class CheckSortedArray {
    public static void main(String[] args) {
        int[] arr = {3, 3, 2, 2, 4};
        boolean isSorted = true;

        if(arr[0] < arr[arr.length - 1]) {
            for(int index = 0; index < arr.length - 1; index++){
                if(arr[index] > arr[index + 1]) {
                    isSorted = false;
                    break;
                }
            }
        } else if (arr[0] > arr[arr.length - 1]){
            for(int index = 0; index < arr.length - 1; index++){
                if(arr[index] < arr[index + 1]){
                    isSorted = false;
                    break;
                }
            }
        }

        System.out.println(isSorted);
    }
}
