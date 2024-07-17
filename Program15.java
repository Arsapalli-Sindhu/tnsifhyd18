package com.day1;

import java.util.Scanner;

public class Program15 {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("enter n value");
			int n=input.nextInt();
			int sum=0;
			for(int i=0;i<=n;i++)
			{
				sum=sum+i;
			}
			System.out.println("Sum of natural numbers "+sum);
		}
		
	}

}
