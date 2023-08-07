import java.util.Scanner; 
public class HeightConverterApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HeightConverter hc = new HeightConverter();
		System.out.println("Enter the height in inches : ");
		double height = scan.nextDouble();
		System.out.printf("%.2f",hc.convertInchesToFeet(height) );
		
	}

}
