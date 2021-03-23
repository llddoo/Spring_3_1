package com.iu.s3.member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class MemberDAO {
	
	@Autowiredu
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.iu.s3.member.MemberDAO.";
	
	//memberJoin 데이터를 받아서 DB에 insert 하는 메서드
	public int memberJoin(MemberDTO memberDTO)throws Exception{
		
		
		return sqlSession.join(NAMESPACE+"memberJoin", memberDTO);
		
	}
	
	
	//login - id pw를 받아서 조회
	public MemberDTO memberLogin(MemberDTO memberDTO)throws Exception{
		
		
		return memberDTO;
	}

}
