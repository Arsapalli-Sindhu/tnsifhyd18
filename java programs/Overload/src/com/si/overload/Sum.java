package com.si.overload;

public class Sum {
    void sum(int x,int y)
    {
    	System.out.println(x+y);
    }
    void sum(int x,int y,int z) {
    	System.out.println(x+y+z);
    }
    static int add(int a,int b) {
    	return a+b;
    }
    static int add(int a,int b,int c) {
    	return a+b+c;
    }
    
	public static void main(String[] args) {
		Sum s1=new Sum();
       s1.sum(5,5);
       s1.sum(5,5,5);
       System.out.println(Sum.add(10,20));
       System.out.println(Sum.add(10,20,30));
	}

}
