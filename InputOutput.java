import java.util.*;

public class InputOutput{
    public static void main(String[] args){
        //Output
        System.out.print("Hey"); //Print without newline
        System.out.println("Hello"); //Print with newline

        //Input
        Scanner read = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = read.nextInt();  //Take Input
        System.out.println("The number is : " + a); //Show output
    }
}