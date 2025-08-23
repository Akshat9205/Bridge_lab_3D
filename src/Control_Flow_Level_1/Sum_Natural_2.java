package Control_Flow_Level_1;
import java.util.*;
public class Sum_Natural_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n >= 0) {
            int formulaSum = n * (n + 1) / 2;
            int i = 1, whileSum = 0;
            while (i <= n) {
                whileSum += i;
                i++;
            }

            System.out.println("Sum using formula = " + formulaSum);
            System.out.println("Sum using while loop = " + whileSum);
            System.out.println("Both results are same? " + (formulaSum == whileSum));
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }

        sc.close();
	}

}
