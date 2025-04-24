public class ThreeDigitAN{
	public static void main(String[] args){
		for(int number = 100; number < 1000; number++){
			if(checkArmstrong(number) == true){
				System.out.print(number + " ");
			}
		}
	}
	static boolean checkArmstrong(int number){
		int temp = number, answer = 0;
		while(temp != 0){
			answer = answer + powerOf((temp % 10), digitsIn(number));
			temp /= 10;
		}
		if(answer == number) {
			return true;
		} else {
			return false;
		}
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
