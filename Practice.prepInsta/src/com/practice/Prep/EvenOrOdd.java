package com.practice.Prep;
import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = scan.nextInt();
		
		if(num%2 == 0) {
			System.out.println(num+ " is an even number");
		}
		else {
			System.out.println(num+ " is a odd number");
		}
		scan.close();
				
	}

}
