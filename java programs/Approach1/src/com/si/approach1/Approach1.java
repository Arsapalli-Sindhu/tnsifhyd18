package com.si.approach1;

public class Approach1 {
       int a=10;//instance variable
       static int b=20;
       void display()
       {
    	   System.out.println("Hi!");
       }
       static String display1()
       {
    	   return "hello";
       }
	public static void main(String[] args) {
		
		int c=30;
		Approach1 a1=new Approach1();
		System.out.println(a1.a);
		a1.display();
		System.out.println(Approach1.b);
		System.out.println(Approach1.display1());
		System.out.println(c);

	}

}
