package Recursion;

public class PrintTriangle {
    public static void main(String[] args) {
        printPattern1(4, 1);
        printPattern2(4, 1);
    }

    static void printPattern1(int row, int column) {
        if(row < 1) return;
        if(column <= row) {
            System.out.print('*');
            printPattern1(row, column + 1);
        }
        else {
            System.out.println();
            printPattern1(row - 1, 1);
        }
    }

    static void printPattern2(int row, int column) {
        if(row < 1) return;
        if(column <= row) {
            printPattern2(row, column + 1);
            System.out.print('*');
        }
        else {
            printPattern2(row - 1, 1);
            System.out.println();
        }
    }
}