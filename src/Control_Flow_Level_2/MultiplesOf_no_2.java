package Control_Flow_Level_2;
import java.util.*;
public class MultiplesOf_no_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number > 0 && number < 100) {
            System.out.println("Multiples of " + number + " below 100:");
            int counter = 1;
            while (counter * number < 100) {
                System.out.println(counter * number);
                counter++;
            }
        } else {
            System.out.println("Enter a positive integer less than 100");
        }
        sc.close();
	}

}
