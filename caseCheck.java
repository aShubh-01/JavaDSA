import java.util.Scanner;
public class caseCheck {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        char letter = read.next().trim().charAt(0);

        if(letter >= 'a' && letter <= 'z'){
            System.out.println("It is lowercase");
        } else if(letter >= 'A' && letter <= 'Z'){
            System.out.println("It is uppercase");
        } else {
            System.out.println("It is not an alphabet");
        }
    }
}
