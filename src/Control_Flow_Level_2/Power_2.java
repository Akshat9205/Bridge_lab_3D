package Control_Flow_Level_2;
import java.util.*;
public class Power_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int power = sc.nextInt();

        if (power < 0) {
            System.out.println("Power should be a positive integer");
        } else {
            int result = 1;
            int counter = 0;
            while (counter < power) {
                result *= number;
                counter++;
            }
            System.out.println(number + "^" + power + " = " + result);
        }
        sc.close();
	}

}
