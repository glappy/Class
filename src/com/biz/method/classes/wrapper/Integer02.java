package com.biz.method.classes.wrapper;

public class Integer02 {

	public static void main(String[] args) {
		
		int intNum1 = 50 ;
		Integer integerNum1 = intNum1 ;
		System.out.println(integerNum1.toString());
		System.out.println(Integer.valueOf(intNum1));
		System.out.println(Integer.toHexString(intNum1));
		System.out.println(Integer.toOctalString(intNum1));
		System.out.println(Integer.toBinaryString(intNum1));
		
		
	}
}
