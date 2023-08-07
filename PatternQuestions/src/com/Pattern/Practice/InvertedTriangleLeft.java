package com.Pattern.Practice;
import java.util.Scanner;
public class InvertedTriangleLeft {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = scan.nextInt();
		for(int i = n;i>=1; i--) {
			for(int j = 1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}

// ALTERNATE METHOD FOR THE ABOVE ------------------------------------------
/*
 * for(int i = 1; i <= n; i++){
 * for(int j = 1; j<=(n-i+1);j++){
 * System.out.print(j);
 * }
 * System.out.println();
 * }
 * }
 * }*/


 */ 
