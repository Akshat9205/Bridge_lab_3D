package Control_Flow_Level_1;
import java.util.*;
public class Table {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
        sc.close();
	}

}
