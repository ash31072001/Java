import java.util.Scanner;
public class FinanceCalculatorApp {

	public static void main(String[] args) {
		FinanceCalculator fc = new FinanceCalculator();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the principal , rate and time : ");
		double principal = scan.nextDouble();
		double rate = scan.nextDouble();
		double time = scan.nextDouble();
		System.out.printf("%.2f",fc.calculateSimpleInterest(principal, rate, time) );
;
	}

}
