package com.day1;

import java.util.Scanner;

public class Program13 {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter string 1");
			String s1=input.nextLine();
			System.out.println("Enter string 2");
			String s2=input.nextLine();
			String concatenatedstring=s1+s2;
			System.out.println("Concatenated string is  "+concatenatedstring);
		}

	}

}
