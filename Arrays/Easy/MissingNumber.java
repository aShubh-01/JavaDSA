package Arrays.Easy;

public class MissingNumber {
    public static void main(String[] args){
        int[] arr = {1, 2, 4, 5};
        int missingNumber = arr[arr.length - 1] + 1;

        for(int index = 0; index < arr.length; index++){
            if(arr[index] != index + 1){
                missingNumber = index;
            }
        }

        System.out.println(missingNumber);
    }
}