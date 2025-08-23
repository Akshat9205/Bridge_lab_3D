package Control_Flow_Level_1;
import java.util.*;
public class Sum_Natural_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n >= 0) {
            int formulaSum = n * (n + 1) / 2;
            int forSum = 0;
            for (int i = 1; i <= n; i++) {
                forSum += i;
            }

            System.out.println("Sum using formula = " + formulaSum);
            System.out.println("Sum using for loop = " + forSum);
            System.out.println("Both results are same? " + (formulaSum == forSum));
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }
        sc.close();

	}

}
