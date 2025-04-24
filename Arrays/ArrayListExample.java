package Arrays;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ArrayList<String> alist = new ArrayList<>();
        alist.add("Shubham");
        alist.add("Sarthak");
        alist.add("Karan");
        alist.add("Swapnil");
        alist.add("Fardin");
        int size = alist.size();
        System.out.println(alist.contains("Swapnil"));
        System.out.println(alist.size());
        System.out.println(size);
    }

}
