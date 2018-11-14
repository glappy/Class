package com.biz.method.classes.oop01;

import com.biz.method.classes.dao.MemberDAO;
import com.biz.method.classes.vo.MemberVO;

public class MemberExec03 {

	private void main() {
		// TODO Auto-generated method stub

		MemberVO vo = new MemberVO() ;
		vo.setStrId("001") ;
		vo.setStrName("lee") ;
		vo.setStrTel("001-001-0011") ;
		vo.setIntAge(16) ;
		vo.setStrAddr("namwon") ;
		
		MemberDAO dao = new MemberDAO(vo) ;
		dao.viewMember();
	}
	
	
	
}
