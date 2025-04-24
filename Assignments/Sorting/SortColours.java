package Assignments.Sorting;

import java.util.Arrays;
public class SortColours {
    public static void main(String[] args) {
        int colours[] = {2, 0, 2, 1, 1, 0};

        for(int range = colours.length - 1; range > 0; range--){
            for(int index = 0; index < range; index++){
                if(colours[index + 1] < colours[index]){
                    int temp = colours[index];
                    colours[index] = colours[index + 1];
                    colours[index + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(colours));
    }
}
