package com.biz.method.classes.dao;

import com.biz.method.classes.vo.DogVO;

public class DogDAO {

	public DogVO dogVO ;
	
	public DogDAO() {
		dogVO = new DogVO() ;
		
		
	}
	
	public void dogRun() {
		
		String strName = this.dogVO.getStrName() ;
		System.out.println(strName);
			
		
	}
	
	public void dogRun(String strField) {
		String strName = this.dogVO.getStrName() ;
		strName += " " + strField ;
		strName += " " ;
		System.out.println(strName + " ");
		System.out.println(strName);
	}
	public void goEat() {
		String strName = this.dogVO.getStrName() ;
		System.out.println(strName);
	}
	
	
}
