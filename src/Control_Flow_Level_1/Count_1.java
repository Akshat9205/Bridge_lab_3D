package Control_Flow_Level_1;
import java.util.*;
public class Count_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int counter = sc.nextInt();

        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
        System.out.println("Blast Off!");
        sc.close();
	}
}
