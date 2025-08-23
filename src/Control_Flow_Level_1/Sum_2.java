package Control_Flow_Level_1;
import java.util.*;
public class Sum_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        double total = 0.0;

        while (true) {
            double value = sc.nextDouble();
            if (value <= 0) {
                break;
            }
            total += value;
        }

        System.out.println("Total = " + total);
        sc.close();
	}

}
