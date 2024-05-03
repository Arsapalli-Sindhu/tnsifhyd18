package com.si.approach2;

public class Access {

	public static void main(String[] args) {
		NormalClass n1=new NormalClass();
		System.out.println(n1.a);
		n1.display();
		System.out.println(NormalClass.b);
		System.out.println(NormalClass.display1());

	}

}
