package com.practice.Striver;
import java.util.Scanner;
public class DataTypes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the data type : ");
		String type = scan.next();
		
		switch(type) {
		case "Long":
			System.out.println("8");
			break;
			
		case "Float":
			System.out.println("4");
			break;
			
		case "Integer":
			System.out.println("4");
			break;
			
		case "float":
			System.out.println("4");
			break;
			
		case "Double":
			System.out.println("8");
			break;
			
		case "Character":
			System.out.println("1");
			break;
			
		default:
			System.out.println();
			
		}
		scan.close();
		
		
		
		
	}

	

}
