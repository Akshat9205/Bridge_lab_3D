package Control_Flow_Level_1;
import java.util.*;
public class Spring_Season {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter day (1-31): ");
        int day = sc.nextInt();

        boolean isSpring = (month == 3 && day >= 20 && day <= 31)   // March 20 - March 31
                        || (month == 4 && day >= 1 && day <= 30)    // April
                        || (month == 5 && day >= 1 && day <= 31)    // May
                        || (month == 6 && day >= 1 && day <= 20);   // June 1 - June 20

        if (isSpring) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }

        sc.close();
	}

}
