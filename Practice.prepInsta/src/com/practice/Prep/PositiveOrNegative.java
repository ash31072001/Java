package com.practice.Prep;
import java.util.Scanner;

public class PositiveOrNegative {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number : ");
		int num = scan.nextInt();
		
		if (num<0) {
			System.out.println( num+" is a negative number");
		}
		else if(num == 0) {
			System.out.println(num+ " is neither neagtive nor a positive number");
		}
		
		else{
			System.out.println(num+" is a positive number");
			
		}
		scan.close();
		
	}

}
