package com.day1;

import java.util.Scanner;

public class Program14 {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter year");
			int year=input.nextInt();
			boolean leapyear=(year%4==0&&year%100!=0)||(year%400==0);
					if(leapyear) {
						System.out.println("leapyear");
					}
					else
					{
						System.out.println("not a leap year");
					}
		}

	}

}
