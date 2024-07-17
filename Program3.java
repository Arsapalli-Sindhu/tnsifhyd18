package com.day1;


import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("enter a number");
			int n=input.nextInt();
			if(n==0||n==1)
			{
				System.out.println("Factorial is 1");
			}
			else
			{
				int fact=1;
				for(int i=n;i>0;i--)
				{
					 fact=fact*i;
				}
				System.out.println("Factorial is "+fact);
			}
		}

	}

}
