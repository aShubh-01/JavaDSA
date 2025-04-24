import java.util.Scanner;

public class Demo{
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		System.out.print("Enter a base and power : ");
		int base = read.nextInt(), power = read.nextInt();
		System.out.println(powerOf(base, power));
	}
	static int powerOf(int base, int power){
		int baseToThePower = 1;
		while(power != 0){
			baseToThePower *= base;
			power -= 1;
		}
		return baseToThePower;
	}
}
