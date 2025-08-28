package Control_Flow_Level_1;
import java.util.*;
public class LargeOf_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();

        System.out.println("Is the first number the largest? " + (number1 >= number2 && number1 >= number3));
        System.out.println("Is the second number the largest? " + (number2 >= number1 && number2 >= number3));
        System.out.println("Is the third number the largest? " + (number3 >= number1 && number3 >= number2));
		sc.close();
	}
}
