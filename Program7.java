package com.day1;

import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter a string");
			String s=input.nextLine();
			String reversed="";
			for(int i=s.length()-1;i>=0;i--) {
				
				reversed+=s.charAt(i);
				
			}
			System.out.println("Reversed string "+ reversed);
		}
	}

}
