package com.practice.Prep;
import java.util.Scanner;

public class SumOfNaturalNo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = scan.nextInt();
		
		System.out.println((n*(n+1))/2);
		scan.close();

	}

}
