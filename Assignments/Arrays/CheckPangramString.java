package Assignments.Arrays;
import java.util.ArrayList;
public class CheckPangramString {
    public static void main(String[] args) {
        String sentence = "hello world";
        int alphabetCount = 0;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            for(int index = 0; index < sentence.length(); index++){
                if (sentence.charAt(index) == ch) {
                    alphabetCount++;
                    break;
                }
            }
        }
            System.out.println(alphabetCount);
    }
}
