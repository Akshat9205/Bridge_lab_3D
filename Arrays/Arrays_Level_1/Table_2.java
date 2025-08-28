package Arrays_Level_1;
import java.util.*;
public class Table_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] multiplicationResult = new int[4]; 

        for (int i = 0; i < 4; i++) {
            multiplicationResult[i] = number * (i + 6);
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(number + " * " + (i + 6) + " = " + multiplicationResult[i]);
        }
        sc.close();
	}
}
