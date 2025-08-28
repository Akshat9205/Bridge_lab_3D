package Control_Flow_Level_1;
import java.util.*;
public class Count_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int counter = sc.nextInt();

        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Blast Off!");
        sc.close();
	}

}
