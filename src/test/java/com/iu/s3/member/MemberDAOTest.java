package com.iu.s3.member;


import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.s3.MyAbstractTest;

public class MemberDAOTest extends MyAbstractTest {
	
	@Autowired
	private MemberDAO memberDAO;
	
	@Test
	public void setMemberFileInsertTest() throws Exception{
		MemberFileDTO memberFileDTO = new MemberFileDTO();
		memberFileDTO.setId("iu");
		memberFileDTO.setFileName("f1");
		memberFileDTO.setOrigineName("o1");
		
		int result = memberDAO.setFileInsert(memberFileDTO);
		assertEquals(1, result);
	}
	
	
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

	//@Test
	public void memberLoginTest() throws Exception {
	
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId("iu");
		memberDTO.setPw("pw1");
		memberDTO = memberDAO.memberLogin(memberDTO);
		
		assertNotNull(memberDTO);
	}
}