import java.util.*;

public class conditions {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        int salary = read.nextInt();

        if(salary > 10000){
            System.out.println("Salary is greater than 10,000");
        } else if(salary == 10000) {
            System.out.println("Salary is 10,000");
        } else {
            System.out.println("Salary is less than 10,000");
        }
    }
}
