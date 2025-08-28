package Arrays_Level_2;
import java.util.*;
public class Bonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        double[] salary = new double[10];
        double[] years = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter salary of employee " + (i + 1) + ": ");
            salary[i] = sc.nextDouble();

            System.out.println("Enter years of service of employee " + (i + 1) + ": ");
            years[i] = sc.nextDouble();
            if (salary[i] <= 0 || years[i] < 0) {
                System.out.println("Invalid input! Try again.");
                i--; 
                continue;
            }
            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
            totalBonus += bonus[i];
        }
        System.out.println("\nTotal Old Salary = " + totalOldSalary);
        System.out.println("Total Bonus = " + totalBonus);
        System.out.println("Total New Salary = " + totalNewSalary);
		sc.close();
	}

}
