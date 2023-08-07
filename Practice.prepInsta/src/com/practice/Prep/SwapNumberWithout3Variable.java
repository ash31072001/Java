package com.practice.Prep;

public class SwapNumberWithout3Variable {
	public static void main(String[] args) {
		int m = 20;
		int n = 10;
		swapNo(m,n);
		
	}
	
	
	public static void swapNo(int m , int n) {
		m = m -n;
		n = m + n;
		m = n - m;
		System.out.println("The value of m is "+m+" and the value of n is "+n);
	}

}
