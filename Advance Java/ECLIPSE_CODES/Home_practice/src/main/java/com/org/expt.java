package com.org;

public class expt {
	int a = 10;
	
	public static void main(String[] args) {
		A o = new A();
		o.accept("hello", "hii",o);
		A.prinn();
		
	}

}

class A{
	
	String x ;
	String y ;
	 static A obj;
	public void accept(String x,String y, A o) {
		this.x = x;
		this.y = y;
		obj = o;
	}
	
	public static void prinn() {
		A a = obj;
		System.out.println(a.x+" "+a.y);
	}
}
