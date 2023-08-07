import java.util.Scanner;
public class ArrayNames {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of people : ");
		int num = scan.nextInt();
		
		boolean []arr = new boolean[num];
		
		for(int i = 1 ; i<= (arr.length); i++) {
			System.out.println("Is the person"+ i +" married ?");
			
			
			arr[i] = scan.nextBoolean();
			
			
		}
		System.out.println("The info are  ....");
		
		for(int i = 0;i<= (arr.length-1); i++ ) {
			System.out.println(arr[i]+ " "); 
			
		}
;		

	}

}
