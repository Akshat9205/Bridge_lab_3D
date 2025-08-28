package Arrays_Level_2;
import java.util.*;
public class BMI_2D {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        double[][] personData = new double[n][3];
        String[] weightStatus = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for person " + (i + 1));
            while (true) {
                System.out.print("Enter weight (kg): ");
                personData[i][0] = sc.nextDouble();
                if (personData[i][0] > 0) break;
                System.out.println("❌ Weight must be positive!");
            }
            while (true) {
                System.out.print("Enter height (m): ");
                personData[i][1] = sc.nextDouble();
                if (personData[i][1] > 0) break;
                System.out.println("❌ Height must be positive!");
            }
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);
            if (personData[i][2] < 18.5) weightStatus[i] = "Underweight";
            else if (personData[i][2] < 24.9) weightStatus[i] = "Normal weight";
            else if (personData[i][2] < 29.9) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }
        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < n; i++) {
            System.out.printf("Person %d -> Height: %.2fm, Weight: %.2fkg, BMI: %.2f, Status: %s\n",
                    (i + 1), personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }
        sc.close();
	}

}
