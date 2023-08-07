import java.util.Scanner;
public class JourneyCalculatorApp {

	public static void main(String[] args) {
		JourneyCalculator journeyCalculator = new JourneyCalculator();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter speed and time :");
		double speed = scan.nextDouble();
		double time = scan.nextDouble();
		
		double res = journeyCalculator.calculateDistance(speed , time);
		System.out.println(res);

	}

}
