package com.iu.s3.member;


import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.s3.MyAbstractTest;

public class MemberDAOTest extends MyAbstractTest {
	
	@Autowired
	private MemberDAO memberDAO;
	
	//@Test
	public void memberJoinTest() throws Exception {
		
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId("Goal");
		memberDTO.setPw("2222");
		memberDTO.setName("gggg");
		memberDTO.setPhone("01033235511");
		memberDTO.setEmail("gggg.naver.com");
		
		int result = memberDAO.memberJoin(memberDTO);
		
		assertEquals(1, result);	
	}

	@Test
	public void memberLoginTest() throws Exception {
	
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId("Goal");
		memberDTO.setPw("2222");
		memberDTO = memberDAO.memberLogin(memberDTO);
		
		assertNotNull(memberDTO);
	}
}