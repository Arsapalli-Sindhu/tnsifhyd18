package com.day1;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter a number");
			int n=input.nextInt();
			int count=2;
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
					count++;
				}
				
			}
			if(count==2)
			{
				System.out.println("It is a prime number");
			}
			else
			{
				System.out.println("Not a prime number");
			}
		}

	}

}
