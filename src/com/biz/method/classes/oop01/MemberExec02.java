package com.biz.method.classes.oop01;

import com.biz.method.classes.dao.MemberDAO;

public class MemberExec02 {

	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO() ;
		dao.viewMember();
		
		dao.memberVO.strId = "001" ;
		dao.memberVO.strName = "hong" ;
		dao.memberVO.setStrTel("010-010-0100") ;
		dao.memberVO.setStrAddr("seoul") ;
		dao.memberVO.setIntAge(30) ;
		dao.viewMember();
		
	}
}
