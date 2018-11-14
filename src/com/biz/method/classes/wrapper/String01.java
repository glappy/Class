package com.biz.method.classes.wrapper;

public class String01 {

	public static void main(String[] args) {
		String strName = "hong" ;
		String strN = "" ;
		System.out.println(strN);
		
		String strNation = new String() ;
		System.out.println(strNation);
		
		String strDog = new String("bull") ;
		
		strNation = "korea" ;
		strName = "tom" ;
		System.out.println(strNation.length()); 
		
		System.out.println(strName.toLowerCase()); 
		System.out.println(strName.toUpperCase()); 
		
		if(strName.toUpperCase() == "TOM") {
			System.out.println("youareright");
		}
		
		if(strName == "tom") {
			System.out.println("youareright");
		}
			
		if(strName.equals("TOM")) { 
			System.out.println("yesheis");
		}else {
			System.out.println("nohesnot");
		}
		
		if(strName.toUpperCase().equals("TOM")) {
			System.out.println("yesheis");
		}
		
		if(strName.equalsIgnoreCase("toM")) {
			System.out.println("mixed");
		}
		
		String strA = "A" ;
		if(strA == "A") {
			System.out.println("youareright");
		}
		
		
		
	}
}
