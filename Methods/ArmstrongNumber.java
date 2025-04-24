import java.util.Scanner;

public class ArmstrongNumber{
	public static void main(String[] args){
		Scanner read = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int number = read.nextInt();
		if(number == checkArmstrong(number)) {
			System.out.println("It is armstrong number");
		} else {
			System.out.println("It is not armstrong number");
		}
	}
	static int checkArmstrong(int number){ 
                int answer = 0, temp = number;
                while(number != 0){ 
                        answer = answer + powerOf((number % 10), digitsIn(temp));
                        number /= 10;
                }
                return answer;
        }


	static int powerOf(int base, int power){

		int baseToThePower = 1;
		while(power != 0){
			baseToThePower *= base;
			power -= 1;
		}
		return baseToThePower;
	}

	static int digitsIn(int number){

		int count = 0;
		while(number != 0){
			count += 1;
			number /= 10;
		}
		return count;
	}
}
