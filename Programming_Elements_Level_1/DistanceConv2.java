package Programming_Elements_Level_1;
import java.util.*;
public class DistanceConv2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);  
        double km;
        System.out.print("Enter distance in km: ");
        km = input.nextDouble();       
        double miles = km / 1.6; 
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
        input.close();
	}
}
