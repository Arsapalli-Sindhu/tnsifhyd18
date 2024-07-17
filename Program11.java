package com.day1;

import java.util.Scanner;

public class Program11 {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("enter n value");
			int n=input.nextInt();
			int revno=0;
			while(n!=0)
			{
				int digit=n%10;
				revno=revno*10+digit;
				n=n/10;
			}
			System.out.println("reversed number is  "+ revno);
		}
	}

}
