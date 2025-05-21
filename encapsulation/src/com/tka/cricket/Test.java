package com.tka.cricket;

public class Test {

	public static void main(String[] args) {

		Player PP = new Player(11, "ABC", 300, 50, "XYZ");
		PP.setjerseyNo(11);
		PP.setname("ABC");
		
		System.out.println(PP.getjerseyNo());
		System.out.println(PP);
	}
	

}
