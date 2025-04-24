package Assignments;

import java.util.*;

public class Assignment1 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        //Fibonacci series upto n number
        /*
        System.out.print("Enter a number : ");
        int n = read.nextInt() - 2;
        int firstNum = 0;
        int secondNum = 1;
        int thirdNum;
        
        System.out.print(firstNum + " " + secondNum + " ");
        while(n != 0){
            thirdNum = firstNum + secondNum;
            System.out.print(thirdNum + " ");
            firstNum = secondNum;
            secondNum = thirdNum;
            n -= 1;
        }
         */
         

        //Rupees to USD
        /*
        System.out.print("Enter currency in rupees : ");
        float rupees = read.nextFloat();
        System.out.println("USD amount is : " + (rupees / 83));
         */

        //Largest number of two
        /*
        System.out.println("Enter any two number : ");
        int number1 = read.nextInt();
        int number2 = read.nextInt();
        if(number1 > number2){
            System.out.println(number1 + " is larger");
        }else {
            System.out.println(number2 + " is larger");
        }
         */

        //Simple calculator
        /*
        System.out.print("Enter a number : ");
        int number1 = read.nextInt();
        System.out.print("Enter a operator(+, -, , *, %) : ");
        char operator = read.next().charAt(0);
        System.out.print("Enter next number : ");
        int number2 = read.nextInt();
        float answer = 0;

        if(operator == '+'){
            answer = number1 + number2;
        }else if(operator == '-'){
            answer = number1 - number2;
        }else if(operator == '/'){
            answer = number1 / number2;
        }else if(operator == '*'){
            answer = number1 * number2;
        }else if(operator == '%'){
            answer = number1 % number2;
        }

        System.out.println("Answer is : " + answer);
        */

        //Simple Interest
        /*
        System.out.print("Enter Principal amount : ");
        int principalAmount = read.nextInt();
        System.out.print("Enter time(years) : ");
        int time = read.nextInt();
        System.out.print("Enter rate : ");
        float rate = read.nextFloat();

        float simpleInterest = (principalAmount * rate * time)/100;
        System.out.println("Simple interest on this is " + simpleInterest);
        */

        
        //Greet using name
        /* 
        System.out.print("What is your name? : ");
        String name = read.nextLine();
        System.out.println("Hello " + name + "! nice to meet you!"); 
        */

        //Print even or odd number
        /* 
        System.out.print("Enter a number : ");
        int number = read.nextInt();
        if(number % 2 == 0){
            System.out.println("It is even number");
        } else {
            System.out.println("It is odd number");
        } 
        */
    }
}