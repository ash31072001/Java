package com.Pattern.Practice;
import java.util.Scanner;
public class RightTriangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the value of n: ");
		int n = scan.nextInt();
		
		for(int i = 1; i<=n; i++) {
			// space loop 
			for(int j = 1; j<=(n-i); j++) {
				System.out.print(" ");
			}
			for(int j = 1 ; j<=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
