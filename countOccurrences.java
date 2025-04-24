import java.util.Scanner;
public class countOccurrences {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print("Enter any number : ");
        Long num = read.nextLong();
        System.out.print("Which digit's occurence do you want to count? : ");
        int checkDigit = read.nextInt(), occurenceCount = 0;

        while(num > 0){
            if((num % 10) == checkDigit){
                occurenceCount += 1;
            }
            num /= 10;
        }

        System.out.println(checkDigit + " occured " + occurenceCount + " time(s)");
    }
}
