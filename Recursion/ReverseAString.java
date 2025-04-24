package Recursion;
import java.util.Arrays;
public class ReverseAString {
    public static void main(String[] args) {
        String[] str = {"H", "e", "l", "l", "o"};
        revString(str, 0, str.length - 1);
    }

    static void revString(String[] str, int start, int end){
        if(start == end){
            System.out.println(Arrays.toString(str));
        } else {
            String temp = str[start];
            str[start] = str[end];
            str[end] = temp;

            revString(str, start + 1, end - 1);
        }
    }
}
