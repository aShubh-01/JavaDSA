package Arrays;
import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args){
        int[] rollno;        //Initialization of array(compile time)
        rollno = new int[5]; //Declaration of array(run time)
        rollno[0] = 10;        //Accessing elements of array
        rollno[1] = 11;
        rollno[2] = 12;
        rollno[3] = 13;
        rollno[4] = 14;

        int[] nums = {3, 6, 9}; //Initialization + Declaration of elements

        System.out.println(Arrays.toString(rollno)); //using Arrays.toString() method

//        for(int num = 0; num < rollno.length; num++){   //Conventional way to print array
//            System.out.print(rollno[num] + " ");
//        }

//        for(int number : rollno){               //enhanced way to print array
//            System.out.println(number + " ");
//        }
    }
}
