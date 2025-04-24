import java.util.*;
public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = read.nextInt();
        int digits = String.valueOf(n).length();
        int sum = 0;
        while(n > 0){
            sum += powerOf((n % 10), digits);
            n /= 10;
        }

        System.out.println("Sum is " + sum);
    }

    static int powerOf(int n, int power) {
        int answer = 1;
        while(power > 0){
            answer = answer * n;
            power -= 1;
        }
        return answer;
    }
}
