package Control_Flow_Level_1;
import java.util.*;
public class Divide_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	     int number = sc.nextInt();
	     System.out.println("Is the number " + number + " divisible by 5? " + (number % 5 == 0));
	     sc.close();
	}
}
