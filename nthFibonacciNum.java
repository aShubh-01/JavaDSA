import java.util.Scanner;
public class nthFibonacciNum {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = read.nextInt();
        Long firstNum = 0L, secondNum = 1L;
        Long count = 2L, nthNum = 0L;

        while(count <= n){
            nthNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nthNum;
            count += 1;
        }

        System.out.println(n + "th fibonacci number : " + nthNum);
    }
}
