import java.util.Scanner;
public class GCDandLCM {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = read.nextInt();
        System.out.print("Enter second number : ");
        int num2 = read.nextInt();

        int smallerNum = Math.min(num1, num2);
        int gcd = smallerNum;
        for(int divisor = 2; divisor < smallerNum; divisor++){
            if((num1 % divisor == 0) && (num2 % divisor == 0)){
                gcd = divisor;
            }
        }

        System.out.println(gcd);
    }
}
