package com.tnsif.springs;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c[]= {'i','n',};
		String s1=new String(c);
		String s2=new String(s1);
		
		System.out.println(s1);
		System.out.println(s2);
		
		
		String s3=new String("india");
		String s4 = s3.toUpperCase();
		
		System.out.println(s4);
		
		int no=s4.length();
		System.out.println("length of the string ");
		String s5=s4.trim();
		System.out.println(s5);
		System.out.println(s5.charAt(3));
		System.out.println(s5.substring(1,5));
		s5.isEmpty();
		
		// ==:- memory checks weather they contain in same location or not (like true or false)
		//equals():- checks the same or not (returns true or false)
		
		//compareTo():- it uses hashcode method
		
		String s6=new String("indiaaaa");
		String s7=new String("indiaaaa");
	//	System.out.println(s6.hashcode());
		
		
		System.out.println(s6.compareTo(s6));
		System.out.println(s7.compareTo(s7));
		
		
		
		
	}

}
