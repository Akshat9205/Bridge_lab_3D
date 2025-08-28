package Arrays_Level_2;
import java.util.*;
public class Digit_Frequency {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = sc.nextLong();
        if (num < 0) {
            num = -num;
        }
        int[] freq = new int[10];
        if (num == 0) {
            freq[0] = 1;
        }
        while (num > 0) {
            int digit = (int)(num % 10);
            freq[digit]++;
            num /= 10;
        }
        System.out.println("\nDigit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " => " + freq[i] + " time(s)");
            }
        }
        sc.close();
	}

}
