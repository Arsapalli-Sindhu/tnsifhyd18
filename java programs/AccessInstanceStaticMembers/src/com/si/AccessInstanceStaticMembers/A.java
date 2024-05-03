package com.si.AccessInstanceStaticMembers;


public class A {
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
		A a1=new A();
		System.out.println(a1.a);
		a1.display();
		System.out.println(A.b);
		System.out.println(A.display1());
		System.out.println(c);

	}


}
