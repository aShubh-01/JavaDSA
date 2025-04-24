package Recursion;

public class nthFibonacciNum {
    public static void main(String[] args){
        System.out.println(nthFib(0, 1, 5));
        System.out.println(fibOfN(5));
    }

    static int nthFib(int t1, int t2, int num){
        if (num == 1){
            return t1;
        } else {
            return nthFib(t2, t1 + t2, num - 1);
        }
    }

    static int fibOfN(int num){
        if(num == 2){
            return 1;
        } else if (num == 1) {
            return 0;
        }
        return (fibOfN(num - 1) + fibOfN(num - 2));
    }
}
