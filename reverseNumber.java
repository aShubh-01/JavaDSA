import java.util.Scanner;
public class reverseNumber {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter any number : ");
        Long num = read.nextLong(), sum = 0L;

        while(num > 0){
            sum = (sum * 10) + (num % 10);
            num /= 10;
        }

        System.out.print("Reverse is : " + sum);
    }
}
