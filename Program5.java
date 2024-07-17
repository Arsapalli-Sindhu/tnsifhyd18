package com.day1;

import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter First number a ");
			int a=input.nextInt();
			System.out.println("Enter Second number b");
			int b=input.nextInt();
			System.out.println("Enter Third number c");
			int c=input.nextInt();
			if(a>b&&a>c)
			{
				System.out.println("A is greater");
			}
		
			else if(b>c&&b>a) {
				System.out.println("B is greater");
			}
			else
			{
				System.out.println("C is greater");
			}
		}
				
	}

}
