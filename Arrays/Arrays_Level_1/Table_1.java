package Arrays_Level_1;
import java.util.*;
public class Table_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int[] table = new int[10];

        for (int i = 0; i < 10; i++) {
            table[i] = number * (i + 1);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }
		sc.close();
	}
}
