package com.practice.Striver;
import java.util.Scanner;
public class InputChar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a character : ");
		char ch = scan.next().charAt(0);
		
		if('A'<=ch && ch<='Z') {
			System.out.println("1");
			
		}
		else if('a'<=ch && ch<='z') {
			System.out.println("0");
		}
		else {
			System.out.println("-1");
		}
		scan.close();
	}

}
