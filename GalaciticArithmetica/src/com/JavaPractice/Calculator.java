package com.JavaPractice;
import java.util.Scanner;
public class Calculator {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int result1 = addition(num1 , num2);
		int result2 = subtraction(num1 , num2);
		int result3 = multiplication(num2 , num2);
		int result4 = modulus(num1 , num2);
		double result5 = division(num1, num2);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}
	
	public static int addition(int num1, int num2) {
		return (num1 + num2);
	}
	public static int subtraction(int num1, int num2) {
		return (num2 - num1);
	}
	public static int multiplication(int num1, int num2) {
		return (num1 * num2);
	}
	public static int modulus(int num1, int num2) {
		return (num1 % num2);
	}
	public static int division(int num1, int num2) {
		return (num1 / num2);
	}
	

}
