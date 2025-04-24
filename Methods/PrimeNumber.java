import java.util.Scanner;

public class PrimeNumber{
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int number = read.nextInt();
		System.out.println(checkPrime(number));
	}
	
	static  String checkPrime(int number){
		boolean isPrime = true;
		for(int divisor = 2; divisor < number; divisor++){
			if(number % divisor == 0){
				isPrime = false;
				break;
			}
		}
		if(isPrime == false){
			return "It is not a prime number";
		} else  {
			return "It is a prime number";
		}
	}
}
