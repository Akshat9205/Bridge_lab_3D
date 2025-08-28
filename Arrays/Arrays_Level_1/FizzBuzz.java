package Arrays_Level_1;
import java.util.*;
public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input. Enter a positive integer.");
        }

        String[] results = new String[n];

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i - 1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i - 1] = "Fizz";
            } else if (i % 5 == 0) {
                results[i - 1] = "Buzz";
            } else {
                results[i - 1] = String.valueOf(i);
            }
        }

        for (int i = 0; i < results.length; i++) {
            System.out.println("Position " + (i + 1) + " = " + results[i]);
        }
        sc.close();
	}

}
