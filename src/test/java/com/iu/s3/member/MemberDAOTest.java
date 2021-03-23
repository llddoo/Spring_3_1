package com.iu.s3.member;


import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.s3.MyAbstractTest;

public class MemberDAOTest extends MyAbstractTest {
	
	@Autowired
	private MemberDAO memberDAO;
	
	@Test
	public void memberJoin() throws Exception {
		
		MemberDTO memberDTO = new MemberDTO();
		
		
		
		assertEquals(1, result);
		
	}
	
}
