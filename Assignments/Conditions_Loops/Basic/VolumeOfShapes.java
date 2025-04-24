package Assignments.Conditions_Loops.Basic;
import java.util.Scanner;
public class VolumeOfShapes {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        float volume = 0, radius, length, breadth, height;
        System.out.print("***** Volume of Shapes *****\n");

        while(true){
            System.out.print("1. Cone\n2. Prism\n3. Cylinder\n4. Sphere\n5. Pyramid\nAny key to exit\nEnter choice : ");
            char selectNumber = read.next().trim().charAt(0);
            if(selectNumber == '1'){                                            // Cone
                System.out.print("*** Cone ***\nEnter radius and height : ");
                radius = read.nextFloat();
                height = read.nextFloat();
                volume = (3.14f * radius * radius * height) / 3;

            } else if(selectNumber == '2'){                                     // Prism
                System.out.print("*** Prism ***\nEnter length & breadth of base, height of prism : ");
                length = read.nextFloat();
                breadth = read.nextFloat();
                height = read.nextFloat();
                volume = (length * breadth) * height;

            } else if(selectNumber == '3'){                                     // Cylinder
                System.out.print("*** Cylinder ***\nEnter radius and height : ");
                radius = read.nextFloat();
                height = read.nextFloat();
                volume = 3.14f * radius * radius * height;

            } else if(selectNumber == '4'){                                     // Sphere
                System.out.print("*** Sphere ***\nEnter radius : ");
                radius = read.nextFloat();
                volume = (4 * 3.14f * radius * radius * radius) / 3;

            } else if(selectNumber == '5'){                                     // Pyramid
                System.out.print("*** Pyramid ***\nEnter length & breadth of base, height of pyramid : ");
                length = read.nextFloat();
                breadth = read.nextFloat();
                height = read.nextFloat();
                volume = (length * breadth * height) / 3;

            } else {
                break;
            }
            System.out.println("Volume is : " + volume);
        }
    }
}
