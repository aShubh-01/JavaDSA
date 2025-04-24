package Arrays.Easy;
import java.util.Arrays;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 3, 4, 0, 7, 0};
        int nonZeroIndex = 0;

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != 0) {
                if (nonZeroIndex != index) {
                    int temp = arr[nonZeroIndex];
                    arr[nonZeroIndex] = arr[index];
                    arr[index] = temp;
                }
                nonZeroIndex++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
