package com.day1;

import java.util.Scanner;

public class Program6 {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("enter n value");
			int n=input.nextInt();
			int p=0,q=1;
			System.out.println("Fibonacci"+n+"numbers");
			for(int i=2;i<=n;i++) {
				System.out.println(p+"");
				int s=p+q;
				p=q;
				q=s;
				}
	
		}
	}

}
