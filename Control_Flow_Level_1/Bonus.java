package Control_Flow_Level_1;
import java.util.*;
public class Bonus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        double salary = sc.nextDouble();
        int years = sc.nextInt();

        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus = " + bonus);
        } else {
            System.out.println("No bonus (service less than or equal to 5 years).");
        }
        sc.close();
	}

}
