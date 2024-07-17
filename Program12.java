package com.day1;

import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("enter first number");
			float n1=input.nextFloat();
			System.out.println("Enter second number");
			float n2=input.nextFloat();
			float avg=(n1+n2)/2;
			System.out.println("The average of two numbers is "+ avg);
		}		

	}

}
