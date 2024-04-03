package com.tns.exception;

public class WithoutException {
	public static void main(String args[]) {
		
	
	int d = 0;
	try {
		
	int a =42/d;
	System.out.println("now  ");
	}
	catch(ArithmeticException ob) {
		System.out.println("Exception is caught"+ob);
		}
	System.out.println("now  it will be printed");
			
	}


}
