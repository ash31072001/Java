import java.util.Scanner;
public class PlanetExplorerApp {

	public static void main(String[] args) {
		PlanetExplorer pl = new PlanetExplorer();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius : ");
		double radius = scan.nextDouble();
		System.out.printf("%.2f",pl.calculateSurfaceArea(radius));
		

	}

}
