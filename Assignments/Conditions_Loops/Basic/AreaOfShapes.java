package Assignments.Conditions_Loops.Basic;

import java.util.Scanner;

public class AreaOfShapes{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("**** Area of Shapes ****");
        float area = 0, radius, length, breadth, height, base, side;
        System.out.println("Select the shape to calculate its area : ");

        while(true) {
            System.out.print("1. Circle\n2. Triangle\n3. Rectangle\n4. Isosceles Triangle\n5. Paralellogram\n6. Rhombus\n7. Equilateral Triangle\nAny Key to exit\nEnter choice : ");
            char selectNumber = read.next().trim().charAt(0);
            if(selectNumber == '1'){                                              // Circle
                System.out.print("*** Circle ***\nEnter radius : ");
                radius = read.nextFloat();
                area = 3.14f * radius * radius;

            } else if(selectNumber == '2'){                                       // Triangle
                System.out.print("*** Triangle ***\nEnter Base and Height : ");
                base = read.nextFloat();
                height = read.nextFloat();
                area = (base * height) / 2;

            } else if(selectNumber == '3'){                                       // Rectangle
                System.out.print("*** Rectangle ***\nEnter Length and Breadth : ");
                length = read.nextFloat();
                breadth = read.nextFloat();
                area = length * breadth;

            } else if(selectNumber == '4'){                                       // Isosceles Triangle
                System.out.print("*** Isosceles Triangle ***\nEnter base and side : ");
                base = read.nextFloat();
                side = read.nextFloat();
                height = (float) Math.sqrt((side * side) - ((base * base) / 4));
                area = (base / 2) * height;

            } else if(selectNumber == '5'){                                       // Paralellogram
                System.out.print("*** Paralellogram ***\nEnter base and height : ");
                base = read.nextFloat();
                height = read.nextFloat();
                area = base * height;

            } else if(selectNumber == '6'){                                       // Rhombus
                System.out.print("*** Rhombus ***\nEnter height and length : ");
                height = read.nextFloat();
                length = read.nextFloat();
                area = (height * length) / 2;

            } else if(selectNumber == '7'){                                       // Equilateral Triangle
                System.out.print("*** Equilateral Triangle ***\nEnter side : ");
                side = read.nextFloat();
                area = (float) (Math.sqrt(3) / 4) * (side * side);

            } else {
                break;
            }

        System.out.println("\n\nArea is : " + area);
        }

    }
}