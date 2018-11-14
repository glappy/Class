package com.biz.classes.oop01;

public class BookExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BookVO book = new BookVO() ; // initialize book object with bookvo class
		String strName = "java" ; // save data on each variables of book object
		String strAuth = "yoon" ;
		String strComp = "orange" ;
		String strDsc = "study" ;
		int intPrice = 30000 ;
		int intDC = 3000 ;
		
		viewBook(strName, strAuth, strComp, strDsc, intPrice, intDC) ; // call a method properties book which is set
		
		strName = "data" ;
		strAuth = "lee" ;
		strComp = "young media" ;
		strDsc = "study" ;
		intPrice = 45000 ;
		intDC = 4500 ;
		viewBook(strName, strAuth, strComp, strDsc, intPrice, intDC) ;		
		
		
	}
	
	public static void viewBook(BookVO vo) {
		System.out.println("==================");
		System.out.println("info");
		System.out.println("------------------");
		System.out.println("title : " + vo.strName);
		System.out.println("author : " + vo.strAuth);
		System.out.println("company : " + vo.strComp);
		System.out.println("info : " + vo.strDsc);
		System.out.println("price : " + vo.intPrice);
		System.out.println("discount : " + vo.intDC);
			
		
	}
	
	
	public static void viewBook(String strName, String strAuth, String strComp, String strDsc, int intPrice, int intDC) {
		System.out.println("==================");
		System.out.println("info");
		System.out.println("-------------------");
		System.out.println("title : " + strName);
		System.out.println("author : " + strAuth);
		System.out.println("company : " + strComp);
		System.out.println("info : " + strDsc);
		System.out.println("price : " + intPrice);
		System.out.println("discount : " + intDC);
		
		
	}

}
