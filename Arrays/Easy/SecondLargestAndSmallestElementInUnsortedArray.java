package Arrays.Easy;

public class SecondLargestAndSmallestElementInUnsortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        int smallest, secondSmallest, largest, secondLargest;

        smallest = arr[0];
        secondSmallest = arr[1];
        largest = arr[arr.length - 1];
        secondLargest = arr[arr.length - 2];

        for(int index = 0; index < arr.length; index++){
            if(arr[index] < smallest){
                secondSmallest = smallest;
                smallest = arr[index];
            }

            if(arr[index] > largest){
                secondLargest = largest;
                largest = arr[index];
            }
        }

        System.out.println(largest + " " + secondLargest + " " + smallest + " " + secondSmallest);
    }
}
