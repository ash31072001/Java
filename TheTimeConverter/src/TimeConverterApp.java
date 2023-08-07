import java.util.Scanner;
public class TimeConverterApp {

	public static void main(String[] args) {
		TimeConverter tc = new TimeConverter();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the minutes to be converted into hours : ");
		int minutes = scan.nextInt();
		System.out.println("The hours are "+ TimeConverter.convertToHours(minutes));

	}

}