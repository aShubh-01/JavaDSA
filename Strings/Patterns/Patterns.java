package Strings.Patterns;

public class Patterns {
    public static void main(String[] args) {
        pattern7(40);
    }

    static void pattern0(int n){                                        //         *
        for(int row = 0; row <= n * 2; row++){                          //       *   *
            int printCols = row <= n ? row + 1 : ((2 * n) - row) + 1;   //      *     *
            int spaceCols = n - printCols + 1;                          //       *   *
                                                                        //         *
            for(int spaceCol = 1; spaceCol <= spaceCols; spaceCol++){
                System.out.print(" ");
            }

            for(int col = 1; col <= printCols; col++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static void pattern1(int n){
        int count;
        for(int row = 1; row <= n; row++){

            for(int col = row; col <= n; col++){            // 1 2 3 4 5
                if(row != 1 && col > row && col < n) {      // 2     5
                    System.out.print("  ");                 // 3   5
                } else {                                    // 4 5
                    System.out.print(col + " ");            // 5
                }
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for(int row = 1; row <= n; row++){
            for(int spaceCol = n; spaceCol > row; spaceCol--){      //             1
                System.out.print("  ");                             //          2  3  2
            }                                                       //       3  4  5  4  3
                                                                    //    4  5  6  7  6  5  4
            for(int col = row; col <= (2 * row) - 1;  col++){       // 5  6  7  8  9  8  7  6  5
                System.out.print(col + " ");
            }

            for(int col = (2 * row) - 2; col >= row ; col--){
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }

    static void pattern3(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row;  col++){
                System.out.print(col + " ");                        // 1
            }                                                       // 1  2  1
                                                                    // 1  2  3  2  1
            for(int col = row - 1; col >= 1; col--){                // 1  2  3  4  3  2  1
                System.out.print(col + " ");                        // 1  2  3  4  5  4  3  2  1
            }

            System.out.println();
        }
    }

    static void pattern4(int n){
        for(int row = 1; row <= n; row++){                       // 1
            int printNum = (row % 2 == 0) ? 0 : 1;               // 0 1
            for(int col = 1; col <= row; col++){                 // 1 0 1
                System.out.print(printNum);                      // 0 1 0 1
                printNum = (printNum == 1) ? 0 : 1;              // 1 0 1 0 1
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for(int row = 0; row < n; row++){
            for(int spaces = row; spaces < n; spaces++){                //          A
                System.out.print("  ");                                 //        A B A
            }                                                           //      A B C B A
                                                                        //    A B C D C B A
            char ch = 'A';                                              //  A B C D E D C B A
            int middlePoint = ((2 * row) + 1) / 2;
            for(int cols = 0; cols < (2 * row) + 1; cols++){
                System.out.print(ch + " ");
                if (cols < middlePoint) {
                    ch++;
                } else {
                    ch--;
                }
            }

            System.out.println();
        }
    }

    static void pattern6(int n){
        for(int row = 1; row <= n; row++){
            for(int cols = 1; cols <= row; cols++){                     //1             1
                System.out.print(cols + " ");                           //1 2         2 1
            }                                                           //1 2 3     3 2 1
                                                                        //1 2 3 4 4 3 2 1
            int spacesSize = (2 * n) - (2 * row);
            for(int spaces = 1; spaces <= spacesSize; spaces++){
                System.out.print("  ");
            }

            for(int cols = row; cols >= 1; cols--){
                System.out.print(cols + " ");
            }

            System.out.println();
        }
    }

    static void pattern7(int n){
        int printNum = 1;
        for(int row = 1; row <= n; row++){
            for(int cols = 1; cols <= row; cols++){
                System.out.print(printNum + " ");
                printNum += 1;
            }

            System.out.println();
        }
    }
}
