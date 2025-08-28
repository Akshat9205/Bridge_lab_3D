package Arrays_Level_2;
import java.util.*;
public class BMI_1D {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for person " + (i + 1));
            while (true) {
                System.out.print("Enter weight (kg): ");
                weight[i] = sc.nextDouble();
                if (weight[i] > 0) break;
                System.out.println("❌ Weight must be positive!");
            }
            while (true) {
                System.out.print("Enter height (m): ");
                height[i] = sc.nextDouble();
                if (height[i] > 0) break;
                System.out.println("❌ Height must be positive!");
            }

            bmi[i] = weight[i] / (height[i] * height[i]);
            if (bmi[i] < 18.5) status[i] = "Underweight";
            else if (bmi[i] < 24.9) status[i] = "Normal weight";
            else if (bmi[i] < 29.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }
        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < n; i++) {
            System.out.printf("Person %d -> Height: %.2fm, Weight: %.2fkg, BMI: %.2f, Status: %s\n",
                    (i + 1), height[i], weight[i], bmi[i], status[i]);
        }
        sc.close();
	}

}
