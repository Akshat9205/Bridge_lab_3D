package Programming_Elements_Level_1;
import java.util.*;
public class Fee2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Enter the Fee: ");
        double fee = input.nextDouble();

        System.out.print("Enter Discount Percent: ");
        double discountPercent = input.nextDouble();

        double discount = (fee * discountPercent) / 100.0;
        double finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount + 
                           " and final discounted fee is INR " + finalFee);
        input.close();
	}
}
