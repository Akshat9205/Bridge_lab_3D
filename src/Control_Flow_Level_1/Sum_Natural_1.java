package Control_Flow_Level_1;
import java.util.*;
public class Sum_Natural_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int number = sc.nextInt();

	        if (number >= 0) {
	            int sum = number * (number + 1) / 2;
	            System.out.println("The sum of " + number + " natural numbers is " + sum);
	        } else {
	            System.out.println("The number " + number + " is not a natural number");
	        }
		sc.close();
	}
}
