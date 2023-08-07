package com.Pattern.Practice;
import java.util.Scanner;
public class StarBlock {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no: of rows : ");
		int m = scan.nextInt();
		System.out.println("Enter the no: of columns : ");
		int n = scan.nextInt();
		for(int i = 1; i<=m ; i++) {
			for(int j = 1; j <= n; j++) {
				System.out.print("*");    // use print as we have to print the * in the same line
			}
			System.out.println();
		}
	}

}
