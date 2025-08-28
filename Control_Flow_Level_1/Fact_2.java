package Control_Flow_Level_1;
import java.util.*;
public class Fact_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Factorial not defined for negative numbers.");
        } else {
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            System.out.println("Factorial of " + n + " = " + fact);
        }
        sc.close();
	}

}
