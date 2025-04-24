package Assignments.Conditions_Loops.Basic;
import java.util.Scanner;
public class SurfaceAreaOfShapes {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        float lateralSurfaceArea = 0,totalSurfaceArea = 0, side, radius, heigth;

        System.out.print("***** Surface Area of Shapes *****\n");
        System.out.print("1. Cube\n2. Cylinder\nEnter choice : ");
        char selectNumber = read.next().trim().charAt(0);
        if(selectNumber == '1'){
            System.out.print("*** Cube ***\nEnter side : ");
            side = read.nextFloat();
            lateralSurfaceArea = 4 * side * side;
            totalSurfaceArea = 6 * side * side;

        }else if (selectNumber == '2'){
            System.out.print("*** Cylindar ***\n Enter radius and height : ");
            radius = read.nextFloat();
            heigth = read.nextFloat();
            lateralSurfaceArea = 2* 3.14f * radius * heigth;
            totalSurfaceArea = 2 * 3.14f * radius * (radius + heigth);

        }
        System.out.println("Lateral Surface area is : " + lateralSurfaceArea + "\nTotal Surface area is : " + totalSurfaceArea);


    }
}
