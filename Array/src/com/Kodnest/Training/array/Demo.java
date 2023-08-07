package com.Kodnest.Training.array;
import java.util.Scanner;
public class Demo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float [][]arr = new float[5][3];
		for(int i = 0; i<=arr.length ; i++) {
			for(int j = 0 ; j<= arr[i].length;j++) {
				
				arr[i][j] = scan.nextFloat();
				
				
			}
			System.out.println("The heights of players are :");
			for(int i1 = 0; i <=arr.length;i1++) {
				for(int j = 0 ; j<= arr[i1].length;j++) {
					System.out.print(arr[i1][j] + " ");
				}
				System.out.println();
			}
			
		}
		
	}

}
