package Control_Flow_Level_1;
import java.util.*;
public class Sum_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double value;

        System.out.println("Enter numbers (0 to stop):");
        value = sc.nextDouble();

        while (value != 0) {
            total += value;
            value = sc.nextDouble();
        }

        System.out.println("Total = " + total);
        sc.close();
	}

}
