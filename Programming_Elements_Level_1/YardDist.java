package Programming_Elements_Level_1;
import java.util.*;
public class YardDist {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();
        double yards = distanceInFeet / 3.0;     
        double miles = yards / 1760.0;            
        System.out.println("The distance is " + distanceInFeet + " feet, which is " + yards + " yards and " + miles + " miles.");
        input.close();
	}
}
