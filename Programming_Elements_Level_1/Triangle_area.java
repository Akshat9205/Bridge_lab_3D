package Programming_Elements_Level_1;
import java.util.*;
public class Triangle_area {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter base in inches: ");
        double base = sc.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = sc.nextDouble();
        double areaInInches = 0.5 * base * height;
        double areaInCm = areaInInches * 6.4516; 
        System.out.println("The area of the triangle is " + areaInInches + " square inches and " + areaInCm + " square centimeters");
        sc.close();
	}
}
