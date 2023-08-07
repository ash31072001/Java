import java.util.Scanner;
public class HlaveItApp {

	public static void main(String[] args) {
		HalveIt hi = new HalveIt();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount to be halved : ");
		double num = scan.nextDouble();
		System.out.printf("%.2f",HalveIt.halveTheNumber(num));

	}

}
