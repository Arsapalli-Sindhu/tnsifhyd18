package com.day1;

import java.util.Scanner;

public class Program8 {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("enter First number");
			int a=input.nextInt();
			System.out.println("enter second number");
			int b=input.nextInt();
			a=a+b;
			b=a-b;
			a=a-b;
			System.out.println("after swapping");
			System.out.println("first number"+a);
			System.out.println("Second number"+b);
		}
	}

}
