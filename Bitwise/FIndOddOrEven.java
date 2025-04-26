package Bitwise;

class FindOddOrEven {
    public static void main(String[] args) {
        int number = 11;
        System.out.println("It is " + findOddOrEven(number));
    }

    static String findOddOrEven(int num) {
        if((num & 1) > 0) { return "Odd"; }
        return "Even";
    }
}

/*
- When we & any number with 1, 
if its odd we will get 1 as remainder, if it even we get 0
- Even in binary, if the unit place digit is 1, 
then our number is odd, because it can evaluated to 1 * 2^0 = 1
*/