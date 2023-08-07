package com.practice.Prep;
import java.util.Scanner;

public class SumNaturalNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number upto which you want sum : ");
		int num = scan.nextInt();
		int sum = 0;
		for(int i = 1 ; i <= num ; i++) {
			
			sum += i;
			
		}
		System.out.println("The sum of first "+num+" natural numbers is "+sum);
		scan.close();
	}

}
