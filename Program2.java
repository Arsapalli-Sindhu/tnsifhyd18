package com.day1;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			int n =input.nextInt();
			if(n%2==0)
			{
				System.out.println("It is even number");
			}
			else
			{
				System.out.println("It is odd number");
			}
		}

	}
}
