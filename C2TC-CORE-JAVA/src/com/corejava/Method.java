package com.corejava;

import java.util.Scanner;

public class Method {
	
	public static int calculateSum(int a, int b) { // Name of Function
		int sum = a + b;
		return sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sum = calculateSum(a, b); // Call the Function
		System.out.print("The sum of 2 number is "+ sum);
		
	}

}
