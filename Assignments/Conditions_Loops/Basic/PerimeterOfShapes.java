package Assignments.Conditions_Loops.Basic;
import java.util.Scanner;
public class PerimeterOfShapes {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        float perimeter = 0, length, breadth, radius, side;

        System.out.print("***** Perimeter of Shapes *****\n");
        while(true){
            System.out.print("1. Circle\n2. Equilateral Triangle\n3. Paralellogram\n4. Rectangle\n5. Square\n6. Rhombus\nAny other key to exit\nEnter choice : ");
            char selectNumber = read.next().trim().charAt(0);

            if(selectNumber == '1'){                                //Circle
                System.out.print("*** Circle ***\nEnter radius : ");
                radius = read.nextFloat();
                perimeter = 2 * 3.14f * radius;

            } else if(selectNumber == '2'){                         //Equilateral Triangle
                System.out.print("*** Equilateral Triangle ***\nEnter side : ");
                side = read.nextFloat();
                perimeter = 3 * side;

            } else if(selectNumber == '3'){                         //Paralellogram
                System.out.print("*** Paralellogram ***\nEnter length and breadth : ");
                length = read.nextFloat();
                breadth = read.nextFloat();
                perimeter = 2 * (length + breadth);

            } else if(selectNumber == '4'){                            //Rectangle
                System.out.print("*** Rectangle ***\nEnter Length and Breadth : ");
                length = read.nextFloat();
                breadth = read.nextFloat();
                perimeter = 2 * (length + breadth);

            } else if(selectNumber == '5'){                             //Square
                System.out.print("*** Square ***\nEnter side : ");
                side = read.nextFloat();
                perimeter = side * 4;

            } else if(selectNumber == '6'){                             //Rhombus
                System.out.print("*** Rhombus ***\nEnter side : ");
                side = read.nextFloat();
                perimeter = side * 4;

            } else {
                break;
            }

            System.out.println("Perimeter is : " + perimeter);

        }
    }
}